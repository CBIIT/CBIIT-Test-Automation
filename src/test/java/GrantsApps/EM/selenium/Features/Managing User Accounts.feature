Feature: Managing User Accounts
  Description:  This Feature file contains Scenarios that verify User Account creation functionalities

  @ENTMAINT-510 @ENTMAINT-515 @ENTMAINT-539 @ENTMAINT-551 @ENTMAINT-554 @ENTMAINT-945 @PUZIKOVAM2 @ANDREYEVE @Regression @selenium
  Scenario: Verify Create Account for "Not Created" Account scenario
    Given User is logged in as Primary IC Coordinator
    And clicks Show Advanced Filters
    And selects "Not Created" in I2E Account Status drop down list
    And searches
    And gets the full NED name of the first record
    And clicks Create on the first record in the results
    And User can verify the page name is "Create New Account"
    And can verify that User's full name is displayed
    And can verify the respective wording of Full Name tooltip "Legal Name is always displayed first, followed by Preferred Name."
    And can verify that the following fields have values displayed: NIH (Network) ID, E-mail, NED Organization, SAC Code, NED Classification
    And can verify that Account Status is set to "Not Created"
    And can verify the table title is "Active I2E Roles"
    And can verify the PDF document link "https://i2e-test.nci.nih.gov/em/assets/docs/I2E%20Roles%20and%20Descriptions.pdf" opens upon clicking on the List of I2E Roles hyperlink
    And can verify that the following fields "Role", "Role Organization", "Assigned Cancer Activities", "Start Date", "Action" are present
    And can verify that "Cancer Activity Monitors (Optional)" title is present
    And can verify that I2E Account History is not present
    And can verify that Save Changes button is disabled
    And can verify that Cancel button is enabled
    And clicks Add Role button
    And clicks I2E Role drop down
    And selects "I2E Technical Support" Role
    And can verify that Business Area drop down is pre-populated with "Administrative" value
    And can verify that all the DOCs contain "CBIIT" in Role Organization drop down list
    And selects CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT) value in the Role Organization drop down list
    And clicks Add Role button within Add Role pop up
    And saves changes
    And can verify the success message is displayed "Success! I2E account has been created."
    And can verify that Return to Manage I2E Users hyperlink directs to url "https://i2e-test.nci.nih.gov/em/#/search"

  @ACTIVE_ACCOUNT_SCENARIO @JIRA-965 @JUAREZDS @Regression @selenium
  Scenario: Verify Create Account - Active Account scenario
    Given User is logged in as Primary IC Coordinator
    And clicks Show Advanced Filters
    And selects "Active" in I2E Account Status drop down list
    And searches
    And gets the full NED name of the first record
    And clicks Create on the first record in the results
    And User can verify the page name is "Modify Account"
    And can verify that User's full name is displayed
    And can verify the respective wording of Full Name tooltip "Legal Name is always displayed first, followed by Preferred Name."
    And can verify that the following fields have values displayed: NIH (Network) ID, E-mail, NED Organization, SAC Code, NED Classification
    And can verify that Account Status is set to "Active"
    And can verify the Add Role button
    And can verify the table title is "Active I2E Roles"
    And can verify the PDF document link "https://i2e-test.nci.nih.gov/em/assets/docs/I2E%20Roles%20and%20Descriptions.pdf" opens upon clicking on the List of I2E Roles hyperlink
    And can verify that the following fields "Role", "Role Organization", "Assigned Cancer Activities", "Start Date", "Action" are present
    And can verify that "Cancer Activity Monitors (Optional)" title is present with tooltip "⠂ Can be assigned to any I2E user"
  """
  ⠂ Can be assigned to any I2E user.
⠂ Users with a Program Analyst role and Cancer Activity monitor can perform referral actions, process ARA and save greensheet(s). All users can run default queries in Referral, ARA, Greensheets, Funding Selections and other modules.
  """
    And user can verify that "Deactivate Account" button is enabled
    And user can verify that " Save Changes " button is disabled
    And user can verify that "Cancel" button is enabled
    And user can verify that "I2E Account History" section is displayed
    And user clicks on Show for "Inactive I2E Roles"
    And user verifies Inactive I2E Roles column header names "Role", "Role Organization", "Start Date", "End Date", "Updated by"
    And user verifies that Start Dates are displayed in descending order
    And user clicks on Show for "Inactive Cancer Activities"
    And user verifies Inactive Cancer Activities column header names "Cancer Activity", "Type", "Start Date", "End Date", "Updated By"
    And user clicks on Show for "Change History"
    And user verifies Change History column header names "Date", "Change(s) Made", "Updated By"
    And user verifies that Start Dates for Change History table are displayed in descending order
    And user is able to click on the hyperlink "Return to Manage I2E Users"