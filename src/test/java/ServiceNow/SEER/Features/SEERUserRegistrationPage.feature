Feature: SEER User Registration Scenarios

  @ODS-283 @bucurgb @Regression @Smoke
  Scenario: Verifying Sate and Zip code fields are required when selecting United States of America for Country field
    Given a user is on the SEER Data Access landing page
    And user proceeds with email verification for Research Data Requests
    When entering and selecting "United States of America" for Country field
    And entering required information except State and Zip code
    And submits the registration form
    Then the user is not able to submit the registration form because the State and Zip Code fields are required

  @ODS-284 @bucurgb @Regression @Smoke
  Scenario: Verifying "Thank you - your registration is complete." page contents
    Given a user is on the SEER Data Access landing page
    When the user enters email address for a Non-Institutional Account
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

  @ODS-285 @ODS-342_357 @bucurgb @Regression @Smoke
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

  @ODS-273_ODS-386 @ODS-286 @bucurgb @Regression
  Scenario: Verifying bread crumbs on "Thank you - your registration is complete." page
    Given a user is on the SEER Data Access landing page
    When user enters email address for a Non-Institutional Account
    And fills out all required fields on SEER Data registration page
    And submits the registration form
    Then user is directed to the 'Thank you - your registration is complete.' page
    Then the following breadcrumbs are displayed "Home", "SEER Data & Software", "SEER Incidence Database", "Request SEER Incidence Data", "Submission Confirmation"

  @ODS-372_ODS-385 @ODS-396_ODS-399 @bucurgb @Regression
  Scenario: Verifying that ASCII characters including periods and Commas can be used in the address field - Partially
    Given a user is on the SEER Data Access landing page
    When user enter an email address for a Non-Institutional Account
    And fills out all required fields on SEER Data registration page
    And submits the registration form
    Then user is directed to the 'Thank you - your registration is complete.' page

  @ODS-370_ODS-392 @bucurgb @Regression
  Scenario: Verifying that "Requestors associated with HHS agencies should login with their PIV cards to request the data." is present
    Given a user is on the SEER Data Access landing page
    Then a user should see (which Federal Government Agencies can sign in with a PIV):
    """
    Requestors associated with HHS agencies should login with their PIV cards to request the data.
    """

  @ODS-362_ODS-345 @ODS-363_ODS-345 @ODS-363_ODS-345 @bucurgb @Regression
  Scenario: SEER Research Database user access logic cycle
    Given a new user who does not have an active SEER Research Database access request
    When enter email for SEER Research Database and click on the Register for Research Data
    Then fills out all required fields on the SEER Data registration form
    And Submits the SEER User Registration form
    And customer account type will be marked as "Public" in Native View
    When enter email for SEER Research Database and click on the Register for Research Data
    Then the user will be brought to the SEER User Registration Page with pre populated data from my customer profile
    And customer account type will show as "Public" in Native View
    When a new request for the user is created for "SEER Research Database"
    Then the user should see page "You Already Have Access to SEER Research Data" when re registering
    And the landing page has link "How to Request Access to SEER Data." for SEER Research Plus Instruction

