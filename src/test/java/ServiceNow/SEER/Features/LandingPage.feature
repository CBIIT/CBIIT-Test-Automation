#Author: Olga
Feature: SEER Data Access Landing Page Scenarios

  @Smoke @juarezds
  Scenario: Verifying Request Database Access text
    Given a user is on the SEER Data Access landing page
    Then the "Request Database Access" text displays as
      """
      Request Database Access
      To request access to the SEER Incidence Databases, you will need to create a new SEER*Stat account by registering. For immediate access to the SEER Research Plus Databases, you will need to register with your eRA Commons credentials using the Institutional Account Login. If you do not have an eRA commons login and are not affiliated with an Institute, you will need to use the Non-Institutional Account, and will receive access to the SEER Research Database.
      If you are affiliated with an Institute and have an institutional email account (.edu, .gov, .org), you must use your eRA Commons credentials to request the SEER data.
      Existing SEER*Stat account holders can upgrade access to the Research Plus Databases by logging in with your SEER*Stat Username and registered email address.
      Only users who have already used this system to request a new, non-Institutional account can upgrade an existing account. All other users should follow steps to create a new account.
      """

  @Smoke @juarezds
  Scenario: Verifying Institutional Accounts, Non-Institutional Accounts, Existing SEER*Stat Account Holders text on landing page
    Given a user is on the SEER Data Access landing page
    Then under "Institutional Accounts" the text displayed is
      """
      Do you have an account affiliated with a research organization?
      Examples include: eRA commons login, NIH, HHS, etc.
      """
    And the text displayed is "* If you are unable to authenticate, please use the Non-institutional option."
    And under "Non-Institutional Accounts", text displayed is
      """
      For all other accounts, please enter your email to continue.
      Examples include Google or Yahoo accounts.
      """
    And under "Existing SEER*Stat Account Holders" text displayed is "Please enter your current SEER*Stat Username and the email address you used to request access to other databases." and "Request SEER Research Plus Databases"
