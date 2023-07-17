Feature: NHGRI Initial workflow Regression testing

  Background:
    Given User logs in to EIDP "EidpUrlNHGRI" as "Username" and "Password"

  @InitiatesIDPnhgri @Smoke @Regression @Zamant2
  Scenario: TC01 IDP request creates and decline and approve
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Rider,Renee    | Green,Eric        | Anderson,Stacie   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Rider,Renee"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Rider,Renee"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Anderson,Stacie"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button NHGRI
    And User clicks on Yes button
    And Logged in user changes the user to "Green,Eric"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @InitiatesIDPnhgriWithUniversity @Zamant2
  Scenario: TC02 IDP request creates with University details and approve
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request with university details
      | Search For                         | Classification Type | NHGRI Training Organization | TrainingTitle          |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         | VF-VISITING FELLOWSHIP |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Rider,Renee    | Green,Eric        | Anderson,Stacie   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Rider,Renee"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Anderson,Stacie"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button NHGRI
    And User clicks on Yes button
    And Logged in user changes the user to "Green,Eric"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDPnhgri @Regression @Zamant2
  Scenario: TC03 Send back to primary mentor flow
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization | IDP Type |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Rider,Renee    | Green,Eric        | Anderson,Stacie   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Rider,Renee"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Anderson,Stacie"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to "Rider,Renee"
    And User clicks on proceed button of the trainee specific IDP NHGRI request
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND BACK TO TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Anderson,Stacie"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button NHGRI
    And User clicks on Yes button
    And Logged in user changes the user to "Green,Eric"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ReviseExistingIDPnhgri @Regression @Zamant2
  Scenario: TC04 Revise Existing IDP
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldnghri @Regression @Zamant2
  Scenario:TC05 IDP is placed on HOLD
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Rider,Renee    | Green,Eric        | Anderson,Stacie   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Rider,Renee"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Anderson,Stacie"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Co-Primary (and/or) Additional Mentor's Review"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will click on General Information section
    And User selects primary mentor as exactly "Burgess,Shawn"
    And User will click on review and take action button
    Then User verifies IDP will be placed on hold message
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"


  @CancelIdpnhgri @Regression @Zamant2
  Scenario:TC07 Cancel IDP
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window

  @UndoCancelIdpnhgri @Regression @Zamant2
  Scenario:TC08 Undo Cancel IDP
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  @AddAndDeleteTempDelegatenhgri @Regression @Zamant2
  Scenario:TC09 Add/Delete Temporary Delegates
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name        | Start Date | End Date   |
      | Craft,Katie | 10/29/2023 | 01/29/2025 |
    Then User checks "Katie Craft" is added as delegate
    When User deletes "Katie Craft" from delegators table

  @AddAndDeletePermanentDelegatenhgri @Regression @Zamant2
  Scenario:TC10 Add/Delete Permanent Delegates
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name        |
      | Craft,Katie |
    Then User checks "Katie Craft" is added as delegate
    When User deletes "Katie Craft" from delegators table

  @DelegateInitiatesIDPnhgri @Regression @Zamant2
  Scenario:TC11 TD Delegate initiates IDP
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name        |
      | Craft,Katie |
    Then User checks "Katie Craft" is added as delegate
    And User will click on Search tab
    And Logged in user changes the user to "Craft,Katie"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @ExistSurveynhgri @Regression @Zamant2
  Scenario:TC12 TD/AO Initiates the Exit Survey for the Fellow/Employee
    And Logged in user changes the user to "Craft,Katie"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHoldnhgri @Regression @Zamant2
  Scenario:TC13 TD Delegates Release IDP placed on HOLD
    And Logged in user changes the user to "Hurle,Belen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Training Director's Review"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will click on General Information section
    And User selects primary mentor as exactly "Burgess,Shawn"
    And User will click on review and take action button
    Then User verifies IDP will be placed on hold message
    And Logged in user changes the user to "Hurle,Belen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button