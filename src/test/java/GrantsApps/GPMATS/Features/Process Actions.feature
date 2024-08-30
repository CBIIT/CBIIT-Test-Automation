Feature: Process Actions Scenarios

  Description: This feature file is to test the Process Actions functionality in GPMATS application

  @Progression @playwright
  Scenario: Test Process/GM Reviewer/Returned to Reviewer to Reviewed, Ready for Release
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
    Given test step with all code for this test case
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
    And the changes will be reflected in the "Change History" section along with any comments provided
















