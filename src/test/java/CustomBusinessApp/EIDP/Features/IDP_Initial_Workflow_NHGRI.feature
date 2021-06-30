@Smoketest
Feature: Regression testing
  @InitiatesIDPnhgri @RegressionNHGRI @Smoke
  Scenario: IDP request creates and decline and approve
    ##Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP request
      |Search For                         | Classification Type | NHGRI Training Organization|
      |NHGRI (Fellows and Employees Only) | Employee            | DIR                        |                                         
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
    | Primary Mentor | Lab Driector name | Co Primary Mentor |
    | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDPnhgri @RegressionNHGRI
  Scenario: Send back to primary mentor flow
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For                        | Classification Type | NHGRI Training Organization|
      | NHGRI (Fellows and Employees Only)| Employee            | DIR                        |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
    | Primary Mentor | Lab Driector name | Co Primary Mentor |
    | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on SEND BACK TO TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

   #working
  @ReviseExistingIDPnhgri @RegressionNHGRI
  Scenario: Revise Existing IDP
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

    #working
    @IDPOnHoldnghri @RegressionNHGRI
    Scenario: IDP is placed on HOLD
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Meeting Verification"
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

    
    #working
  @releaseOnHoldnhgri @RegressionNHGRI
  Scenario: Release IDP placed on hold
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  #working
  @CancelIdpnhgri @RegressionNHGRI
  Scenario: Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Meeting Verification"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  #working
  @UndoCancelIdpnhgri @RegressionNHGRI
  Scenario: Undo Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  #working
  @AddAndDeleteTempDelegatenhgri @RegressionNHGRI
  Scenario: Add/Delete Temporary Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name             | Start Date | End Date   |
      | Craft,Kathleen   | 10/29/2021 | 01/29/2022 |
    Then User checks "Kathleen Craft" is added as delegate
    When User deletes "Kathleen Craft" from delegators table
    Then User check delegate delete message
    
   #working
  @AddAndDeletePermanentDelegatenhgri @RegressionNHGRI
  Scenario: Add/Delete Permanent Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name            |
      | Craft,Kathleen  |
    Then User checks "Kathleen Craft" is added as delegate
    When User deletes "Kathleen Craft" from delegators table
    Then User check delegate delete message

  #working
  @DelegateInitiatesIDPnhgri @RegressionNHGRI
  Scenario: TD Delegate initiates IDP
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name            |
      | Craft,Kathleen  |
    Then User checks "Kathleen Craft" is added as delegate
    And User will click on Search tab  
    And Logged in user changes the user to "Craft,Kathleen"
    And User will click on search in dashboard
    And User creates IDP request
      |Search For                         | Classification Type | NHGRI Training Organization|
      |NHGRI (Fellows and Employees Only) | Employee            | DIR                        | 
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
    | Primary Mentor | Lab Driector name | Co Primary Mentor |
    | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button


  #working
  @ExistSurveynhgri @RegressionNHGRI
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Craft,Kathleen"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  #working
  @TDReleaseHoldnhgri @RegressionNHGRI
  Scenario: TD Delegates Release IDP placed on HOLD
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name            |
      | Hurle,Belen     |
    Then User checks "Belen Hurle" is added as delegate
    And User clicks on Home button
    And Logged in user changes the user to "Hurle,Belen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Meeting Verification"
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
    And Logged in user changes the user to "Hurle,Belen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And User will click on manage delegate tab
    When User deletes "Belen Hurle" from delegators table
    Then User check delegate delete message
