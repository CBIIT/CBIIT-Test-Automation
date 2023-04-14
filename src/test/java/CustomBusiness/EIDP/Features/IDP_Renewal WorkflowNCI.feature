@RegressionNCI
Feature: Regression testing
@NCIRenewal @InitiatesIDP_Renewal @Regression @Smoke @Zamant2 @Needs_review
  Scenario: TC01 IDP request creates and decline and approve
    ##Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization |
      | Non-NCI (Fellows Only) | Fellow              | CCR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Cole, Steven"
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE AND SUBMIT button
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Lipkowitz,Stan"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDP @Regression @sendBackIDPNCIRenewal @Zamant2 @Needs_review
  Scenario: TC02 Send back to primary mentor flow
    ##Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization |
      | Non-NCI (Fellows Only) | Fellow              | CCR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
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

  @ReviseExistingIDP @Regression @Zamant2 @Needs_review
  Scenario: TC03 Revise Existing IDP
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

 
  @IDPOnHold @Regression @Zamant2 @Needs_review
  Scenario: TC04 IDP is placed on HOLD
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Meeting Verification"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And Edit general information
    And User selects primary mentor as "Berzofsky,Jay"
    And Review and Take Action and finish


  @releaseOnHold @Regression @Zamant2 @Needs_review
  Scenario: TC05 Release IDP placed on hold
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdp @Regression @Zamant2 @Needs_review
  Scenario: TC06 Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdp @Regression @Zamant2 @Needs_review
  Scenario: TC07 Undo Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  @AddAndDeleteTempDelegate @Regression @Zamant2 @Needs_review
  Scenario: TC08 Add/Delete Temporary Delegates
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name            | Start Date | End Date   |
      | Gugulothu,Satya | 12/29/2022 | 11/29/2023 |
    Then User checks "Satya Gugulothu" is added as delegate
    When User deletes "Satya Gugulothu" from delegators table
    Then User check delegate delete message

  @AddAndDeletePermanentDelegate @Regression @Zamant2 @Needs_review
  Scenario: TC09 Add/Delete Permanent Delegates
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name            |
      | Gugulothu,Satya |
    Then User checks "Satya Gugulothu" is added as delegate
    When User deletes "Satya Gugulothu" from delegators table
    Then User check delegate delete message


  @DelegateInitiatesIDP @Regression @Zamant2 @Needs_review
  Scenario: TC10 TD Delegate initiates IDP
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization |
      | Non-NCI (Fellows Only) | Fellow              | CCR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
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
    And Logged in user changes the user to "Cole, Steven"
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE AND SUBMIT button
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters verify meeting checkbox and submits
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Verify meeting and accept IDP button
    And User enters verify meeting checkbox and submits and waits for home queue
    And Logged in user changes the user to "Lipkowitz,Stan"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ExistSurvey @Regression @Zamant2 @Needs_review
  Scenario: TC11 TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button
    
  @ExistSurvey @Regression @Zamant2 @Needs_review
  Scenario: TC12 TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "sgugulothuUsername" user on "EidpUrlNCI"
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button
