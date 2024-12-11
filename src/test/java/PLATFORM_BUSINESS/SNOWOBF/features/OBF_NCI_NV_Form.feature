Feature: SNOWOBF Native View form Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Scenarios

  @SNOWOBF-13 @Chaudhryma @Regression @Smoke @playwright
  Scenario: Test Create OBF Helpdesk Module
    Given I am an authenticated OBF fulfiller user
    When I navigate to the Native View and type 'OBF Systems Support' in the navigation search window
    Then I should see the following options in the OBF Systems Support Module: "All Tickets", "Open Tickets", "Closed Tickets", "Budget Unification System (BUS)"

    @SNOWOBF-31 @Chaudhryma @Regression @Smoke @playwright
    Scenario:Test Create Request Form (Native view)
    Given I am an authenticated OBF fulfiller user
    When I navigate to the New or Open Ticket for OBF Systems Solution in Native View
    Then I should see the following layout for the Ticket:
    """
    Number, Approval

    Requested for, State

    Opened by , Assignment group

    Priority , Assigned to

    Watchlist

    Short description

    (Request Details Tab) (Customer Details Tab) (Comments, Notes & Activities Tab)

    Request Details Tab reflects the Request Details in the Portal view

    Customer Details Tab reflects the Customer Details in the Portal view

    Comments etc Tab is additional comments, work notes, & activities

    The 3 added functional buttons are:

    Start Work (appears when state is open, moves state to work in progress)

    Resolved (appears when state is work in progress, moves state to closed complete)
    """