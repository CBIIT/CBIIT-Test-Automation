@NICDR @TryAllNIDCRInitial
Feature: NIDCR work flows

  @Smoke @NIDCRINITIALDIRECTORFLOW
  Scenario: IDP request create by trainee and approve by director flow
    #Given User opens nidcra application in browser
    Given User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) | All                 | DIR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor  | Lab Driector name | Co Primary Mentor |
      | Walrath,Jessica | Bolling,Chris     |                   |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Walrath,Jessica"
    And User clicks on the trainee specific IDP request for renewal
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Walrath,Jessica"
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Bolling,Chris"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And Finish Idp process

  @TDReviewReturnToPM @TDReviewReturnToPMNIDCR
  Scenario: Send the IDP to PM From TD Review
    #Given User opens nidcra application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) |                     | DIR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor  | Lab Driector name | Co Primary Mentor |
      | Walrath,Jessica | Bolling,Chris     | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Walrath,Jessica"
    And User clicks on the trainee specific IDP request for renewal
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Sekiguchi,Rei"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on Yes button
    #And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to "Walrath,Jessica"
    #Then User verifies trainnee request is displayed

  @TDSendBackToFellow @TDSendBackToFellowNIDCR
  Scenario: Send the IDP to fellow From TD Review
    #Given User opens nidcra application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User click on Search button
    And User creates IDP request
      | Search For                         | Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) | All                 | DIR                       |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor  | Lab Driector name | Co Primary Mentor |
      | Walrath,Jessica | Bolling,Chris     | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Walrath,Jessica"
    And User clicks on the trainee specific IDP request for renewal
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Sekiguchi,Rei"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on Yes button
    And Logged in user changes the user to trainee

  #The below scenario covers 1) IDP Declined by PM 2) IDPs Sent to TD Queue
  #@NIDCRAPMDecline @NIDCRAPMDeclineNIDCR
  #Scenario: Send the IDP to fellow From TD Review
    #Given User opens nidcra application in browser
    #When User will login to the application as "gugulothus2" user on "NIDCR"
    #And Logged in user changes the user to "Hauser,Belinda"
    #And User will click on search in dashboard
    #And User creates IDP request
      #| Search For                         | Classification Type | NCI Training Organization |
      #| NIDCR (Fellows and Employees Only) | Fellow              | DIR                       |
    #And Logged in user changes the user to trainee
    #And User will clickOn start idp button
    #And User fills mandatory fields in general information section
      #| Primary Mentor  | Lab Driector name | Co Primary Mentor |
      #| Walrath,Jessica | Bolling,Chris     | Sekiguchi,Rei     |
    #And User fills mandatory fields in project deliverable page
    #And User fills mandatory fields in career goals page
    #And User fills mandatory fields in aligning expecations page
    #And User will click on revew and take action button
    #And User clicks on Send IDP to the Primary Mentor button
    #And Logged in user changes the user to "Walrath,Jessica"
    #And User clicks on the trainee specific IDP request for renewal
    #And User clicks on Decline IDP button
    #And Logged in user changes the user to trainee
    #Then Trainee verifies IDP request status as "Under Trainee's Review"
    #And User will clickOn proceed button
    #And User clicks on Send IDP to the Primary Mentor button
    #And Logged in user changes the user to "Walrath,Jessica"
    #Then User clicks on the trainee specific IDP request for renewal

  @ReviseExistingIDPnidcr @Regressionnidcr @ReviseExistingIDPNIDCR
  Scenario: Revise Existing IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldnidcr @RegressionNHGRI @Karan
  Scenario: IDP is placed on HOLD
    ##Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NIDCR (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor  | Lab Driector name | Co Primary Mentor |
      | Walrath,Jessica | Bolling,Chris     | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Walrath,Jessica"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Walrath,Jessica"
    And User clicks on the trainee specific IDP NHGRI request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
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
    And User selects primary mentor as exactly "Abrams,Shaun"
    And User will click on revew and take action button
    Then User verifies IDP will be placed on hold message

  @releaseOnHoldnidcr @RegressionNHGRI @Karan
  Scenario: Release IDP placed on hold
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdpnidcr @RegressionNHGRI
  Scenario: Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdpnidcr @RegressionNHGRI
  Scenario: Undo Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  @AddAndDeleteTempDelegatenidcr @RegressionNHGRI @TryTest
  Scenario: Add/Delete Temporary Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name          | Start Date | End Date   |
      | Albertini,Ava | 10/29/2021 | 01/29/2022 |
    Then User checks "Ava Albertini" is added as delegate
    When User deletes "Ava Albertini" from delegators table
    Then User check delegate delete message

 @DelegateInitiatesIDPnidcr @RegressionNHGRI
  Scenario: TD Delegate initiates IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name          |
      | Albertini,Ava |
    Then User checks "Ava Albertini" is added as delegate
    And User will click on Search tab
    And Logged in user changes the user to "Albertini,Ava"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For | Classification Type | NCI Training Organization |  
      |            | All                 | DIR                         |  
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor  | Lab Driector name | Co Primary Mentor |
      | Walrath,Jessica | Bolling,Chris    | Sekiguchi,Rei     |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    #When User deletes "Ava Albertini" from delegators table
    #Then User check delegate delete message

  @AddAndDeletePermanentDelegatenidcr @RegressionNHGRI  @Karan
  Scenario: Add/Delete Permanent Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name          |
      | Albertini,Ava |
    Then User checks "Ava Albertini" is added as delegate
    When User deletes "Ava Albertini" from delegators table
    Then User check delegate delete message

  @ExistSurveynidcr @RegressionNHGRI
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Albertini,Ava"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHoldnidcr @RegressionNHGRI @Karan12
  Scenario: TD Delegates Release IDP placed on HOLD
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user on "NIDCR"
    And Logged in user changes the user to "Hauser,Belinda"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name           |
      | Addison,Tamera |
    Then User checks "Tamera Addison" is added as delegate
    And User clicks on Home button
    And Logged in user changes the user to "Addison,Tamera"
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
    And User will click on revew and take action button
    Then User verifies IDP will be placed on hold message
    And Logged in user changes the user to "Addison,Tamera"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
