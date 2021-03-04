#Author: Aidana
Feature: SEER User Registration Scenarios

  @Smoke
  Scenario: Verifying Undergraduate or Graduate students get directed to landing page when selecting 'Undergraduate or Graduate Student' for 'Which of these best describe you?' on the SEER Registration Page
    Given a user is on the SEER Data Access landing page
    When the user enters an email address as "test@mail.com" and continues with the email verification for Non-Institutional Accounts
    And fills out the SEER Registration form
    And for 'Which of these best describe you?' selects 'Undergraduate or Graduate Student'
    Then the user is directed back to the landing page with a message indicating the user must request access via the Institutional Accounts option

  @Smoke
  Scenario: Verifying Sate and Zip code fields are required when selecting United States of America for Country field
    Given a user is on the SEER Data Access landing page
    And user proceeds with email verification for a Non-Institutional Account
    When entering required information
    And entering and selecting "United States of America" for Country field
    And submitting the registration form
    Then the user is not able to submit the registration form because the State and Zip Code fields are required

  @Smoke
  Scenario: Verifying "Thank you - your registration is complete." page contents
    Given a user is on the SEER Data Access landing page
    When the user enters an email address as "email@mail.com" 
    And fills out all required fields on the SEER Data registration page
    And submits the registration form
    Then the "Thank you - your registration is complete." page displays
    And the page header displays as "SEER Incidence Database details"
    And the following text also displays
      """
      Thank you - your registration is complete.
      You will recieve a confirmation email with more instructions momentarily.
      Once the email address you have submitted has been verified you can login and complete the Data Access Request form.
      
      What to expect when completing the data access request form:
      The electronic Data Access Request form requires a brief description of your intended use of the data (based on the type of data being requested). You will also be required to review and agree to the Data Use Agreement (DUA).
      You will also be required to review and agree to the Best Practices for Securing NCI-supported Registry Data.
      Once your access is approved, you will receive a username and password for accessing the data through SEER*Stat Software.
      Note for continued or new data release access: Your access will be restricted on April 30th of each year in preparation for the release of updated data. You will need to re-apply for access to the updated database starting April 1st.
      ← Back to SEER Database details
      """
    And the <- Back to SEER Database details button displays
    And the following SEER information text displays on the bottom of the page
      """
      SEER is supported by the Surveillance Research Program (SRP) in NCI's Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics.
      """
