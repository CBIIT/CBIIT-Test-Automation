Feature: EM Flow

  @I2E_ROLE_DROP_DOWN_LIST @Jira950 @JUAREZDS @Regression @playwright
  Scenario: I2E Role Drop Down List
    Given User is logged in as Primary ITwoE Coordinator - PW
    When User inputs "Mata Rodriguez, Kevin Osmaldo" into the Name field and clicks search - PW
    When User clicks "Edit" button - PW
    And tester deletes "GM Action Manager" role to re-run test before adding role - PW
    And user adds "GM Action Manager" role and verifies role was successfully saved
    When User clicks "Add Role" button - PW
    And user types in "GM" in ITwoE role drop down
    Then the following roles should display "GM Action Manager", "GM Admin", "GM Leadership", "GM Manager", "GM Read Only", "GM Reviewer", "GM Specialist"
    When User chooses Administrative option from Business Area dropdown - PW
    Then the following roles should display "eGrants Access Representative", "I2E Coordinator", "I2E Technical Support", "Primary I2E Coordinator"
    And user can select "eGrants Access Representative" role - PW
    Then user can remove eGrants Access Representative role - PW
    And user clears Administrative option form Business Area choice - PW
    Then ItwoE roles choices are cleared with message "Role is required."
    When the user chooses Financial option from Business Area dropdown - PW
    Then the following roles should display "ARC Funds Approver", "Financial Analyst", "OEFIA Payline Certifier", "Paylist Viewer", "PFR NCI Funds Common Approver"
    When the user chooses General option from Business Area dropdown - PW
    Then the following role should display "I2E User"
    When the user chooses Grants Management option from Business Area dropdown - PW
    Then the following roles should display "GM Action Manager", "GM Admin", "GM Leadership", "GM Manager", "GM Read Only", "GM Reviewer", "GM Specialist", "Greensheets Draft Admin", "Greensheets Draft Viewer", "User of OGA SABRE System"
    When the user chooses Program option from Business Area dropdown - PW
    Then the following roles should display "ARA Authorizer", "Creates & Administers Codes for an Organization", "Division Director", "DOC Approver", "Grant Transfer Administrator", "Indexes Grants for Program and Admin Codes", "NCI Director", "NCI Director's Executive Secretary", "NCI Director's PFR Designee", "Program Analyst"
    When the user chooses Referral option from Business Area dropdown - PW
    Then the following roles should display "ARA Referral Liaison", "ARA Referral Officer", "Referral Officer"
