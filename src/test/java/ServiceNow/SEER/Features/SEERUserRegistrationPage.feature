Feature: SEER User Registration Scenarios

  @juarezds @INVALID
  Scenario: Verifying Undergraduate or Graduate students get directed to landing page when selecting 'Undergraduate or Graduate Student' for 'Which of these best describe you?' on the SEER Registration Page
    Given a user is on the SEER Data Access landing page
    When the user enters an email address as "test@mail.com" and continues with the email verification for Non-Institutional Accounts
    And fills out the SEER Registration form
    And for 'What best describes you for the purpose of requesting this data?' selects 'Undergraduate or Graduate Student'
    Then the user is directed back to the landing page with a message indicating the user must request access via the Institutional Accounts option

  @Smoke @ODS-283 @juarezds
  Scenario: Verifying Sate and Zip code fields are required when selecting United States of America for Country field
    Given a user is on the SEER Data Access landing page
    And user proceeds with email verification for a Non-Institutional Account
    When entering required information
    And entering and selecting "United States of America" for Country field
    And submitting the registration form
    Then the user is not able to submit the registration form because the State and Zip Code fields are required

  @Smoke @ODS-284 @juarezds 
  Scenario: Verifying "Thank you - your registration is complete." page contents
    Given a user is on the SEER Data Access landing page
    When the user enters an email address for Non-Institutional Account
    And fills out all required fields on SEER Data registration page
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
      ← Back to SEER Database details
      """
    And the <- Back to SEER Database details button displays
    And the following SEER information text displays on the bottom of the page
      """
      SEER is supported by the Surveillance Research Program (SRP) in NCI's Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics.
      """

  @Smoke @ODS-285 @juarezds 
  Scenario: Verifying 'SEER Incidence Database' bread crumb directs user to https://seer.cancer.gov/data/
    Given a user is on the SEER Data Access landing page
    Then the 'SEER Incidence Database' bread crumb displays
    And when clicking, user is directed to "https://seer.cancer.gov/data/"
    When the user enter an email address for a Non-Institutional Account
    And the user is on the 'SEER User Registration' page
    Then the 'SEER Incidence Database' bread crumb displays
    And when clicking, user is directed to "https://seer.cancer.gov/data/"
    And fills out all required fields on the SEER Data registration page
    And submits the registration form
    Then user is directed to the 'Thank you - your registration is complete.' page
    And the 'SEER Incidence Database' bread crumb displays
    And when clicking, user is directed to "https://seer.cancer.gov/data/"
    When user confirms their email address by clicking on the email verifation link sent to the users email address
    Then the user is directed to 'SEER Data Access Request' page
    And the 'SEER Incidence Database' bread crumb displays
    And when clicking, user is directed to "https://seer.cancer.gov/data/"
    Then the user has to select a general purpose for using the data
    And also has to agree by typing initials to the Data Use Agreement Certification and Best Practice Assurance
    When successfully submitting the SEER Data Request form
    Then the page 'Thank you - your data access request is complete.' displays
    And the 'SEER Incidence Database' bread crumb displays
    And when clicking, user is directed to "https://seer.cancer.gov/data/"

  @Smoke @ODS-286 @juarezds
  Scenario: Verifying bread crumbs on "Thank you - your registration is complete." page
    Given a user is on the SEER Data Access landing page
    When user enters email address for a Non-Institutional Account
    And fills out all required fields on SEER Data registration page
    And submits the registration form
    Then user is directed to the 'Thank you - your registration is complete.' page
    Then the following breadcrumbs are displayed "Home", "SEER Data & Software", "SEER Incidence Database", "Request SEER Incidence Data", "Submission Confirmation"
    And the 'SEER Incidence Database' bread crumb displays
    And when clicking, user is directed to "https://seer.cancer.gov/data/"
