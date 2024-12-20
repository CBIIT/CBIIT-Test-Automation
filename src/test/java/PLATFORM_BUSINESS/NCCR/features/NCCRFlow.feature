Feature: NCCR flow

  Description: This feature file contains scenarios relating to NCCR Portal

  @selenium @Alena @Regression @NCCR-15 @NCCR-342 @NCCR-346 @NCCR-309 @NCCR-386 @NCCR-387 @NCCR-392
  Scenario: NCCR Home Page Options
    Given  Submitter User logged in to NCCR Portal
    And User can verify that User is on the NCCR Portal landing page
    And User see "My Assigned Data Requests" section
    And User confirms that the text of "My Assigned Data Requests" section is correct
    And User see "Confidentiality Statement" section
    And User confirms that the text of "Confidentiality" section is correct
    When User clicks Go to the NCCR Platform hyperlink
    Then User can confirm that it redirects them to Data Platform page
    And User can see Data Requests Awaiting My Review tab
    And User can see Data Requests Awaiting My Review tab search text field
    And User can see pagination for Data Requests Awaiting My Review tab
    And User clicks on All Data Requests tab
    And User can see All Data Requests tab search text field
    When User clicks Show Filter icon
    Then User can see Load Filter, Save Filter, Add Sort, and New Criteria buttons
    And User can close filter
    And User can see pagination for All Data Requests tab



