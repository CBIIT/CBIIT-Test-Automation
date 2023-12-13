Feature: Managing User Accounts
  Description:  This Feature file contains Scenarios that verify User Account creation functionalities

  @ENTMAINT-492 @ENTMAINT-943 @puzikovam2 @andreyeve @Progression
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
    And clicks Add Role button
    And clicks I2E Role drop down
    And selects "I2E Technical Support" Role
    And can verify that Business Area drop down is pre-populated with "Administrative" value