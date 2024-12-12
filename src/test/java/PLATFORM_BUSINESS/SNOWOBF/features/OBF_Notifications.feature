Feature: SNOWOBF Notifications Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Notifications Scenarios

  @SNOWOBF-37 @Chaudhryma @Regression @Smoke @playwright
  Scenario: Test Create OBF Helpdesk Link on NCI ServiceNow Homepage
  Given I am an authenticated user with NCI credentials
  When I submit a ticket For New Request for Access and the ticket is approved
  Then the requested for should get a notification:
    """
    Subject
    Your OneStream/BUS request - OBF000xxxx has been approved.

    Body
    Hello,
    Your Budget Unification System (BUS) request - OBF000xxxx has been approved.

    If you have any questions regarding the approval of your request, please reach out to OBF Systems Support at NCIOBFSystemsTeam@mail.nih.gov for further clarification.

    Details of your request are displayed below:

    Number: OBF0001097
    Requested for: Ben Foulkes
    Opened by: CBIIT Test Account
    Opened: 10/31/2024 09:04:49
    Application: Budget Unification System (BUS)
    Topic: New Request for Access
    Short description: OBF Systems - Budget Unification System (BUS): New Request for Access
    Description: Test DescriptionAxiqeoztyd

    Thank you,

    OBF Team

    Unsubscribe | Notification Preferences
    """