Feature: SEER Research Plus Login Scenarios

  @ODS-509 @chaudhryma @IN-PROGRESS @selenium
  Scenario: Test Add NCCR Verbiage to SEER Research Plus Approval Emails
    Given a user is approved for SEER Research Plus data
    When they receive the approval email notification
    Then there is text at the bottom of the email notification that details how to access the NCCR Data Platform
    And the body of the email is as follows:
      """
      This is an automated message from NCI's Surveillance, Epidemiology, and End Results Program (SEER) Data Access System. Do not reply back to this message.

      Your request for access to SEER Data has been approved for SEER Research Plus and NCCR Data:

      Name:
      Email address:



      ***HOW TO ACCESS THE DATA***
      SEER*Stat
      You will receive your SEER*Stat account information to access the data in separate emails. After you receive the account information, you can log into the SEER*Stat software to access the SEER data.
      To download SEER*Stat, visit http://seer.cancer.gov/seerstat/download. If you have not installed SEER*Stat before, you will be required to complete the registration form and agree to the Terms of Use.



      NCCR Data Platform
      To access the NCCR Data Platform, visit  https://nccrdataplatform.ccdi.cancer.gov/home.
      """