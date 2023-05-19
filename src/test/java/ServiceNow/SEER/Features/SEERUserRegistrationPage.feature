Feature: SEER User Registration Scenarios

  @ODS-283 @juarezds @Regression @Smoke @Needs_review
  Scenario: Verifying Sate and Zip code fields are required when selecting United States of America for Country field
    Given a user is on the SEER Data Access landing page
    And user proceeds with email verification for Research Data Requests
    When entering and selecting "United States of America" for Country field
    And entering required information except State and Zip code
    And submits the registration form
    Then the user is not able to submit the registration form because the State and Zip Code fields are required

  @ODS-284 @juarezds @Regression @Smoke @Needs_review
  Scenario: Verifying "Thank you - your registration is complete." page contents
    Given a user is on the SEER Data Access landing page
    When user enters email address for a Non-Institutional Account
    And fills out all required fields on SEER Data registration page
    And submits the registration form
    Then the user lands on the "Thank you - your registration is complete." page
    And the page header displays as "SEER Incidence Database details"
    And the following text also displays
      """
      Thank you - your registration is complete.
      You will recieve a confirmation email with more instructions momentarily.
      Once the email address you have submitted has been verified you can login and complete the Data Access Request form.

      ← Back to SEER Database details
      """
    And the <- Back to SEER Database details button displays
    And the following SEER information text displays on the bottom of the page
      """
      SEER is supported by the Surveillance Research Program (SRP) in NCI's Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics.
      """

  @ODS-285 @juarezds @NEEDS_UPDATE
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

  @ODS-286 @juarezds @Regression @Needs_review
  Scenario: Verifying bread crumbs on "Thank you - your registration is complete." page
    Given a user is on the SEER Data Access landing page
    When user enters email address for a Non-Institutional Account
    And fills out all required fields on SEER Data registration page
    And submits the registration form
    Then user is directed to the 'Thank you - your registration is complete.' page
    Then the following breadcrumbs are displayed "Home", "SEER Data & Software", "SEER Incidence Database", "Request SEER Incidence Data", "Submission Confirmation"

