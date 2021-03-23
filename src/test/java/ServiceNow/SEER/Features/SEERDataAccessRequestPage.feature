Feature: SEER Data Access Request Scenarios

  @juarezds @mobile @Progression
  Scenario: Non-Institutional flow - Verifying SEER Data Access Request page contents and agreements for Non-Institutional flow
    Given a SEER User Registration has been successfully submitted
    And user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form
    Then the user is directed to the 'SEER Data Access Request' page
    And the 'Requested for' field contains the name of the requestor in read-only format
    And the 'Database type' field displays with 'SEER Research Database' in read-only format
    And the user can select a general purpose for using the data
    And before entering initials for 'Data Use Agreement Certification' the Initials text box displays with the users initials in read-only mode
    And the Data Use Agreement Certification text agreement displayed
    And before entering initials for 'Best Practice Assurance', the users initials display in read only format
    And the Best Practice Assurance text displayed
    And when the user scrolls down each agreement
    Then the user is able to enter intials
    And SEER information is displayed on the bottom of the page as follows:
      """
      SEER is supported by the Surveillance Research Program (SRP) in NCI's Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics.
      """
    Then after entering required information, the user is able to successfully submit the SEER Data Access Request form
