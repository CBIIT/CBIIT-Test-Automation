Feature: NIDCR Initial workflow Regression testing

  Background:
    Given User logs in to EIDP "EidpUrlNIDCR" as "Username" and "Password"

  @Smoke @NIDCRINITIALDIRECTORFLOW @Regression @Zamant2
  Scenario: TC01 IDP request create by trainee and approve by director flow
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization | IDP Type |
      | NIDCR (Fellows and Employees Only) | All                 | DIR                       |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Wainer,Sandra  | kugler,jamie      |                   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Wainer,Sandra"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And Logged in user changes the user to "kugler,jamie"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And Finish Idp process

  @TDReviewReturnToPM @Regression @Zamant2
  Scenario: TC02 Send the IDP to PM From TD Review
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization | IDP Type |
      | NIDCR (Fellows and Employees Only) |                     | DIR                       |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Wainer,Sandra  | kugler,jamie      | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Wainer,Sandra"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Sekiguchi,Rei"
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to "Wainer,Sandra"
    Then User verifies trainnee request is displayed

  @TDSendBackToTrainee @Zamant2
  Scenario: TC03 Send the IDP to Trainee From TD Review
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User click on Search button
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization | IDP Type |
      | NIDCR (Fellows and Employees Only) | All                 | DIR                       |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Wainer,Sandra  | kugler,jamie      | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Wainer,Sandra"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Sekiguchi,Rei"
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on RETURN TO TRAINEE button

  @ReviseExistingIDPnidcr @Regression @Zamant2
  Scenario: TC04 Revise Existing IDP
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldnidcr @Regression @Karan
  Scenario: TC05 IDP is declined and then placed on HOLD
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization | IDP Type |
      | NIDCR (Fellows and Employees Only) | All                 | DIR                         |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Wainer,Sandra  | kugler,jamie      | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Wainer,Sandra"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Wainer,Sandra"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Hauser,Belinda"
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
    And User selects primary mentor as exactly "Bugge,Thomas"
    And User will click on review and take action button
    Then User verifies IDP will be placed on hold message

  @releaseOnHoldnidcr @Regression @Karan
  Scenario: TC06 Release IDP placed on hold
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button

  @CancelIdpnidcr @Regression @Zamant2
  Scenario: TC07 Cancel IDP
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdpnidcr @Regression @Zamant2
  Scenario: TC08 Undo Cancel IDP
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  @AddAndDeleteTempDelegatenidcr @Regression @Zamant2
  Scenario: TC09 Add/Delete Temporary Delegates
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name          | Start Date | End Date   |
      | Jackson,Stacy | 10/29/2023 | 01/29/2025 |
    Then User checks "Stacy Jackson" is added as delegate
    When User deletes "Stacy Jackson" from delegators table

  @DelegateInitiatesIDPnidcr @Regression @Zamant2
  Scenario: TD Delegate initiates IDP
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name           |
      | Sterling,Carol |
    Then User checks "Carol Sterling" is added as delegate
    And User will click on Search tab
    And Logged in user changes the user to "Sterling,Carol"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For | Classification Type | NCI Training Organization |
      |            | All                 | DIR                       |
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    When User deletes "Carol Sterling" from delegators table

  @ExistSurveynidcr @Regression @Zamant2
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHoldnidcr @Regression @Karan
  Scenario: TD Delegates Release IDP placed on HOLD
    And Logged in user changes the user to "kugler,jamie"
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
    And User selects primary mentor as exactly "Bugge,Thomas"
    And User will click on review and take action button
    Then User verifies IDP will be placed on hold message
    And Logged in user changes the user to "kugler,jamie"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button