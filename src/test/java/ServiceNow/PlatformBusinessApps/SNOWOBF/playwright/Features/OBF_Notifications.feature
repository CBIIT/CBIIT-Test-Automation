Feature: SNOWOBF Notifications Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Notifications Scenarios

  @SNOWOBF-37 @Chaudhryma @Progression
  Scenario: Test Create OBF Helpdesk Link on NCI ServiceNow Homepage
  Given I am an authenticated user with NCI credentials
  When I submit a ticket For "New Request for Access" and the ticket is approved
  Then the requested for should get a notification:
    """
    Subject
    Your OneStream/BUS request - OBF000xxxx has been approved.

    Body
    Hello,
    Your OneStream/BUS request - OBF000xxxx has been approved.

    If you have any questions regarding the approval of your request, please reach out to OBF Systems Support at NCIOBFSystemsTeam@mail.nih.gov for further clarification.

    Details of your request are displayed below:

    Number: OBF0001001
    Requested for:
    Opened by: Ben Foulkes
    Opened: 03/28/2024 14:03:23 EDT
    Application: OneStream/BUS
    Topic:
    Short description: OBF Systems - OneStream/BUS: Other
    Description:


    Thank you,

    OBF Team

    Unsubscribe | Notification Preferences
    """

