Feature: SEER Data Access Landing Page Scenarios

  @Smoke @ODS-264 @ODS-256 @juarezds @Smoke
  Scenario: Verifying Request Database Access text
    Given a user is on the SEER Data Access landing page
    Then the "Request Database Access" text displays as
      """
      Request Database Access
      
      If you are affiliated with a Company, Hospital, Research Institution or University and have an institutional email account (.edu, .gov, .org), you must use your eRA Commons credentials to request the SEER data.
      Information on how to obtain an eRA commons login can be found in the FAQ on the SEER webpage.
      Requestors associated with the NIH, or the following other HHS Agencies should use their PIV Cards to request with an institutional Account: AHRQ, CDC, CMS, FDA, and HIS. All other government agencies will need to submit a request through obtaining eRA commons credentials.
      To request access to the SEER Incidence Databases, you will need to create a new SEER*Stat account by registering. For immediate access to the SEER Research Plus Databases, you will need to register with your eRA Commons credentials using the Institutional Account Login. If you do not have an eRA commons login and are not affiliated with an Institute, you can use a Non-Institutional Account, and will receive access to the SEER Research Database.
      Existing SEER*Stat account holders can upgrade access to the Research Plus Databases by logging in with your institutional account or registered email address.
      Only users who have already used this system to request a new, non-Institutional account can upgrade an existing account. All other users should follow steps to create a new account.
      """

  @Smoke @ODS-265 @ODS-263 @ODS-255 @juarezds
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
