Feature: Process Actions Scenarios

  Description: This feature file is to test the Process Actions functionality in GPMATS application

  @GPMATS-1362 @Regression @playwright @JUAREZDS
  Scenario: Process Action Manager moves action from New to Awaiting GM Review
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
    * * * THIS STEP INCLUDES ALL CODE FOR: TEST PROCESS ACTION MANAGER MOVES ACTION FROM NEW TO AWAITING GM REVIEW * * *
    Then search results with the New Actions status display
    Then automated test retrieves the Action Specialist Name, Grant Number, and the attribute value of the View Notes bubble of the first action for testing
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED * * *
    When if the user clicks on Assign option to an action that has no specialist assigned
    Then the following message displays if no GMS is selected: "Please select GMS before proceeding."
    And in order to proceed with assigning an action for an action that had no specialist assigned, the user has to edit the action by selecting an Action specialist from the Action Specialist drop-down and saves
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble has a red check mark with or without a green dot
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble has a red check mark with or without a green dot again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges then user sees message "Are you sure you want to Assign this action?"
    Then user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters and clicks OK
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Awaiting GM Review" for the action
    And verifies the date stamp of the action is today's date
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT * * *
    When if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble is blank or just has a green dot
    Then optional comments can be entered in the Status Comments field which should not allow more than 2000 characters and clicks ok
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Awaiting GM Review" for the action
    And verifies the date stamp of the action is today's date
    * * * THE FOLLOWING STEPS APPLY TO ALL SCENARIOS ABOVE * * *
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist will see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1363 @Regression @playwright @JUAREZDS
  Scenario: Process Action Manager moves action from New to Pre-Assign
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR THIS TEST CASE - * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Pre-assign" option
    And the system will display warning message "Are you sure you want to Pre-assign this action?" with optional comments box (2000 char max)
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on the "Pre-assign" option again
    Then the system will display warning message "Are you sure you want to Pre-assign this action?" with optional comments box (2000 char max)
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Pre-Assigned" for the action
    And verifies the date stamp of the action is today's date
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Pre-assign' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Pre-assign' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Pre-assign this action?"
    Then user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters and clicks OK
    And verifies that the following confirmation message is displayed: 'Success! The workflow for the 'GPMATS action's grant number' has been successfully processed.'
    And verifies the Status changes from New to "Pre-Assigned" for the action
    And verifies the date stamp of the action is today's date
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1365 @GPMATS-1324 @Regression @playwright @JUAREZDS
  Scenario: Process Action Manager moves action from New to Hold
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR TEST: PROCESS ACTION MANAGER MOVES ACTION FROM NEW TO HOLD * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Put on Hold" option
    And the system will display warning message "Are you sure you want to put this action on Hold?"
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Put on Hold" option again for the same action again
    Then the system will display warning message "Are you sure you want to put this action on Hold?"
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters and clicks OK
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Hold" for the action
    And verifies the date stamp of the action is today's date
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    When the user selects the 'View Notes' bubble for an action that was put on hold
    Then the user should see a header in the Notes section that contains the grant number of the current action
    And the "Special Instruction" header is visible to the user
    And the user observes that the latest note header displays the date when the note was added
    And the user observes that the latest note header shows the name of the user who contributed the note
    And an indication that an action was put on hold is shown to the user via a "HOLD" label next to the author's name in the most recent note header.
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Put on Hold' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Put on Hold' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to put this action on Hold?"
    Then user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters and clicks OK
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Hold" for the action
    And verifies the date stamp of the action is today's date
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    When the user selects the 'View Notes' bubble for an action that was put on hold
    Then the user should see a header in the Notes section that contains the grant number of the current action
    And the "Special Instruction" header is visible to the user
    And the user observes that the latest note header displays the date when the note was added
    And the user observes that the latest note header shows the name of the user who contributed the note
    And an indication that an action was put on hold is shown to the user via a "HOLD" label next to the author's name in the most recent note header.

  @GPMATS-1364 @GPMATS-1571 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves Award action from New to Cancelled
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Type drop-down selects "AWARD" option
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR THIS TEST CASE GPMATS-1364 AND GPMATS-1571 * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Cancel" option
    And the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1364 @GPMATS-1571 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves Revision action from New to Cancelled
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Type drop-down selects "REVISION" option
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR THE SECOND TEST CASE COVERING GPMATS-1364 AND GPMATS-1571 * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Cancel" option
    And the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1367 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves action from Pre-Assigned to New
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "Pre-Assigned" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR THE TEST CASE COVERING GPMATS-1367 * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Mark as New |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Mark as New" option
    And the system will NOT validate that the action has "Specialist" selected
    And the system will display warning message "Are you sure you want to mark this action? as New" with optional comments box (2000 char max)
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from Pre-Assigned to "New" for the action
    And verifies the date stamp of the action is today's date
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Mark as New' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Mark as New' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to mark this action? as New"
    Then user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters and clicks OK
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from Pre-Assigned to "New" for the action
    And verifies the date stamp of the action is today's date
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1366 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves action from Pre-Assigned to Awaiting GM Review
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "Pre-Assigned" option
    And clicks on the Search button
    * * * CODE FOR TEST: PROCESS ACTION MANAGER MOVES ACTION FROM PRE-ASSIGNED TO AWAITING GM REVIEW * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Mark as New |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED * * *
    When if the user clicks on Assign option to an action that has no specialist assigned
    Then the following message displays if no GMS is selected: "Please select GMS before proceeding."
    And in order to proceed with assigning an action for an action that had no specialist assigned, the user has to edit the action by selecting an Action specialist from the Action Specialist drop-down and saves
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble has a red check mark with or without a green dot
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble has a red check mark with or without a green dot again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges then user sees message "Are you sure you want to Assign this action?"
    Then user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters and clicks OK
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Awaiting GM Review" for the action
    And verifies the date stamp of the action is today's date
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT * * *
    When if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble is blank or just has a green dot
    Then optional comments can be entered in the Status Comments field which should not allow more than 2000 characters and clicks ok
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Awaiting GM Review" for the action
    And verifies the date stamp of the action is today's date
    * * * THE FOLLOWING STEPS APPLY TO ALL SCENARIOS ABOVE * * *
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist will see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1368 @GPMATS-1571 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves Award action from Pre-Assigned to Cancelled
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Type drop-down selects "AWARD" option
    And for the Action Status drop-down selects "Pre-Assigned" option
    And clicks on the Search button
    * * * CODE FOR TEST: PROCESS ACTION MANAGER MOVES ACTION FROM PRE-ASSIGNED TO CANCELLED * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Mark as New |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Cancel" option
    And the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from Pre-Assigned to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1368 @GPMATS-1571 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves Revision action from Pre-Assigned to Cancelled
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Type drop-down selects "REVISION" option
    And for the Action Status drop-down selects "Pre-Assigned" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR TEST: PROCESS ACTION MANAGER MOVES REVISION ACTION FROM PRE-ASSIGNED TO CANCELLED * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Assign      |
      | Cancel      |
      | Mark as New |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Cancel" option
    And the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from Pre-Assigned to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1369 @GPMATS-1571 @playwright @JUAREZDS @Regression
  Scenario: Process Action Manager moves Award action from Awaiting GM Review to Cancelled
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Type drop-down selects "AWARD" option
    And for the Action Status drop-down selects "Awaiting GM Review" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR TEST: PROCESS ACTION MANAGER MOVES AWARD ACTION FROM AWAITING GM REVIEW TO CANCELLED * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Cancel      |
      | Mark as New |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Cancel" option
    And the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from "Awaiting GM Review" to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined                   |
      | Award is Not Eligible to Be Paid |
      | Disaggregation                   |
      | Duplicate Award Action           |
      | Early Pay Type 2                 |
      | Early Transition                 |
      | Folded into an OIA               |
      | Grant Terminating                |
      | Moved to Next Fiscal Year        |
      | Skip PFR                         |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in

  @GPMATS-1369 @GPMATS-1571 @playwright @JUAREZDS
  Scenario: Process Action Manager moves Revision action from Awaiting GM Review to Cancelled
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Type drop-down selects "REVISION" option
    And for the Action Status drop-down selects "Awaiting GM Review" option
    And clicks on the Search button
    * * * THIS TEST STEP INCLUDES ALL CODE FOR THIS TEST CASE GPMATS-1368 AND GPMATS-1571 * * *
    And clicks on the Process button for any Action
    Then the following options are displayed:
      | Cancel      |
      | Mark as New |
      | Pre-assign  |
      | Put on Hold |
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *
    And the user is able to select "Cancel" option
    And the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from "Awaiting GM Review" to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
    * * * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot.
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action." and cancels the acknowledgement to verify that the previous step can be performed again with the same action
    When the user clicks on the 'Cancel' option for an action, and the 'View Notes' bubble has a red check mark, either with or without a green dot. again
    Then the user sees message "Please acknowledge all Special Instruction(s) before processing the action."
    When the user acknowledges and sees message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Cancel" on the warning message pop-up - the warning message will be closed, no changes will be made
    When the user clicks on "Cancel" option again for the same action again
    Then the system will display warning message "Are you sure you want to Cancel this action?"
    When the user clicks on the Cancellation Reason drop-down
    Then the following cancellation reasons will be displayed depending on action type:
      | Award Declined            |
      | Disaggregation            |
      | Duplicate Award Action    |
      | Early Pay Type 2          |
      | Early Transition          |
      | Folded into an OIA        |
      | Grant Terminating         |
      | Moved to Next Fiscal Year |
      | No Longer Required        |
      | Skip PFR                  |
    And the user is prompted to select a "Cancellation Reason" before the "Ok" button becomes enabled.
    And user can enter comments in the Status Comments field and verifies that the field does not allow more than 2000 characters
    And the user will be able to click "Ok" on the warning message pop-up
    And verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'
    And verifies the Status changes from New to "Cancelled" for the action
    And verifies the date stamp of the action is today's date
    And Neither the GM Action Manager nor any other authenticated user will have the capability to process an action designated as 'Cancelled'. Furthermore, the 'Process' button for such an action will no longer be visible.
    And the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step
    And the assigned GM Specialist (if any) will NOT see the action on "My Specialist Queue" tab, when logged in
