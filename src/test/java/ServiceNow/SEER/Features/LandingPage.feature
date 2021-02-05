Feature: SEER Data Access Landing Page Scenarios

  @Smoke 
  Scenario: Verifying Request Database Access text
    Given a user is on the SEER Data Access landing page
    Then the "Request Database Access" text displays as
      """
      Request Database Access
To request access to the SEER Incidence Databases, you will need to create a new SEER*Stat account by registering with your institution-affiliated email account for immediate access to both the Research and Research Plus Databases. If you do not have an email address associated with an institution, apply for access using the "Non-Institutional Account" to receive access to the Research Databases.
If you have access to an institutional account, you must use it to request the SEER data.
Existing SEER*Stat account holders can upgrade access to the Research Plus Databases by logging in with your SEER*Stat Username and registered email address.
Only users who have already used this system to request a new, non-Institutional account can upgrade an existing account. All other users should follow steps to create a new account.
      """

  @Smoke  
  Scenario: Verifying Institutional Accounts, Non-Institutional Accounts, Existing SEER*Stat Account Holders text on landing page
    Given a user is on the SEER Data Access landing page
    Then under "Institutional Accounts" the text displayed is 
    """
    Do you have an account affiliated with a research organization?
    Examples include: eRA commons login, .edu login, NIH, HHS, etc.
    """
    And the text displayed is "* If you are unable to authenticate, please use the Non-institutional option."
    And under "Non-Institutional Accounts", text displayed is
     """
     For all other accounts, please enter your email to continue.
     Examples include Google or Yahoo accounts.
     """
    And under "Existing SEER*Stat Account Holders" text displayed is "Please enter your current SEER*Stat Username and the email address you used to request access to other databases." and "Request SEER Research Plus Databases"
