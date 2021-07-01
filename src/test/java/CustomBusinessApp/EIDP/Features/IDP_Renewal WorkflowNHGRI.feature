Feature: Regression testing

  @InitiatesIDP_RenewalNhgri @Regressionnhgri @Smoke
  Scenario: IDP request creates and decline and approve
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And Search with inputs
      | Search For                         | Current IDP Status |
      | NHGRI (Fellows and Employees Only) | Completed          |
    And user will click on revise idp button
    And User clicks on yes button in pop up and stores the user name
    Then Select reason for revise idp and Click On save and send email button
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills general information for renewal
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User adds new project with deliverables
    And User fills mandatory fields in career goals page for renew idp
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And Director user review, approve & submit
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User checks verify meeting checkbox and submits and waits for home page
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on mark as reviewed checkbox
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ReviseExistingIDRenewalPNHGRI @Regressionnhgri
  Scenario: Revise Existing IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldRenewalNHGRI @Regressionnhgri
  Scenario: IDP is placed on HOLD
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And Search with inputs
      | Search For                         | Current IDP Status |
      | NHGRI (Fellows and Employees Only) | Completed          |
    And user will click on revise idp button
    And User clicks on yes button in pop up and stores the user name
    Then Select reason for revise idp and Click On save and send email button
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills general information for renewal
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User adds new project with deliverables
    And User fills mandatory fields in career goals page for renew idp
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Review"
    And User selects "IDP Type" as "Renewal"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And Edit general information
    And User selects primary mentor as "Mullikin,Jim"
    And Review and Take Action and finish

  #And User adds new project with deliverables
  @releaseOnHoldRenewalNHGRI @Regressionnhgri
  Scenario: Release IDP placed on hold
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdpRenewalNHGRI @Regressionnhgri
  Scenario: Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdpRenewalNHGRI @Regressionnhgri
  Scenario: Undo Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window

  @AddAndDeleteTempDelegateRenewalNHGRI @Regressionnhgri
  Scenario: Add/Delete Temporary Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name        | Start Date | End Date   |
      | Bates,Sarah | 10/29/2021 | 01/29/2022 |
    Then User checks "Sarah Bates" is added as delegate
    When User deletes "Sarah Bates" from delegators table
    Then User check delegate delete message

  @AddAndDeletePermanentDelegateRenewalNGHRI @Regressionnhgri
  Scenario: Add/Delete Permanent Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name        |
      | Bates,Sarah |
    Then User checks "Sarah Bates" is added as delegate
    When User deletes "Sarah Bates" from delegators table
    Then User check delegate delete message

  @DelegateInitiatesIDPRenewalNHGRI @Regressionnhgri
  Scenario: TD Delegate initiates IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Hull, Sara"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization |
      | NHGRI (Fellows and Employees Only) | Employee            | DIR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills general information
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly |                   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And Director user review, approve & submit
    And Logged in user changes the user to "Laric,Pnina"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Verify meeting and accept IDP button
    And User enters verify meeting checkbox and submits
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters verify meeting checkbox and submits
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then Finish Idp process

  @ExistSurveyNHGRI @Regressionnhgri
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Craft,Kathleen"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button
