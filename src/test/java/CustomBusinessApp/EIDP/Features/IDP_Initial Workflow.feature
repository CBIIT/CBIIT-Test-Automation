@Smoketest
Feature: Regression testing

  @InitiatesIDP @Regression @Smoke
  Scenario: IDP request creates and decline and approve
    ##Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
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
    And User clicks on the trainee specific IDP request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Cole, Eric"
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
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
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Lipkowitz,Stan"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDP @Regression
  Scenario: Send back to primary mentor flow
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
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
    And User clicks on the trainee specific IDP request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Cole, Eric"
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on SEND BACK TO TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Cole, Eric"
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
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
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Lipkowitz,Stan"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ReviseExistingIDP @Regression
  Scenario: Revise Existing IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHold @Regression
  Scenario: IDP is placed on HOLD
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User selects primary mentor as "Berzofsky,Jay"
    And User adds new project with deliverables

  And User adds new career training activities
  And User edits aligning expectations
  And User will click on revew and take action button
  Then User verifies IDP will be placed on hold message
  @releaseOnHold @Regression
  Scenario: Release IDP placed on hold
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdp @Regression
  Scenario: Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdp @Regression
  Scenario: Undo Cancel IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  @AddAndDeleteTempDelegate
  Scenario: Add/Delete Temporary Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name            | Start Date | End Date   |
      | Gugulothu,Satya | 10/29/2021 | 01/29/2022 |
    Then User checks "Satya Gugulothu" is added as delegate
    When User deletes "Satya Gugulothu" from delegators table
    Then User check delegate delete message

  @AddAndDeletePermanentDelegate @Regression
  Scenario: Add/Delete Permanent Delegates
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name            |
      | Gugulothu,Satya |
    Then User checks "Satya Gugulothu" is added as delegate
    When User deletes "Satya Gugulothu" from delegators table
    Then User check delegate delete message

  @DelegateInitiatesIDP @Regression
  Scenario: TD Delegate initiates IDP
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
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
    And User clicks on the trainee specific IDP request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Cole, Eric"
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
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
    And User clicks on proceed button of the trainee specific IDP request
    And User clicks on Verify meeting and accept IDP button
    And User enters verify meeting checkbox and submits and waits for home queue
    And Logged in user changes the user to "Lipkowitz,Stan"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ExistSurvey @Regression
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHold @Regression
  Scenario: TD Delegates Release IDP placed on HOLD
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @ExistSurvey @Regression
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    #Given User opens nih application in browser
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Bogler, Oliver"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button
    
    @Regression
    Scenario Outline: IDP Search request 
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User selects IDP type as Trainees with IDP
    And User enters "<Trainee First Name>" to first name input box
    And User enters "<Trainee Last Name>" to last name input box
    And User will click Search button
    Then verify expected results as "<Trainee First Name>" and "<Trainee Last Name>"
    Examples: User fills out the form as in the table below:
    |Trainee First Name|Trainee Last Name|
    |Olga              |Kim              | 
    
    @Alena2
    Scenario Outline:IDP Search request specifying  Classification type
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User will select "<Classification Type>" as Classification type
    And User will click Search button
    Then User will verify first page results classification type are "<Classification Type>"
    Examples: Classification Type Options
    |Classification Type|
    |Fellow             |
    |Employee           |
   
    
    @Alena3
    Scenario Outline:IDP Search request specifying  Training Organization and Training Lab, Branch, or Office
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User will select "<Training Organization>" as Training Organization 
    And User will click Search button
    And User will verify first page search results of "<Training Organization>"
    Examples: Training Organization 
    |Training Organization|
    |CBIIT                |
   
    
    @Alena4
    Scenario Outline: IDP Search Request by selecting Primary Mentor
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User will select "<Primary Mentor>" as Primary Mentor
    And User will click Search button
    Then User will verify expected result as "<Primary Mentor>"
    Examples:Primary Mentor Options
    |Primary Mentor|
    |Ali Abazeed   |
    

    #blocker  
    @Alena5 @Inprogress 
    Scenario Outline: IDP Search Request by adding an advanced search
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User will select "<Primary Mentor>" as Primary Mentor
    And User will click Search button
    Then User will verify expected result as "<Primary Mentor>"
    Examples:Advanced Search Options
    |Primary Mentor|
    |Ali Abazeed   |

    @Alena6 @GloriaCalllowaySearch
    Scenario Outline: IDP Search request as Gloria Calloway specifying a full name
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Calloway, Gloria"
    And User enters "<Trainee First Name>" to first name input box
    And User enters "<Trainee Last Name>" to last name input box
    And User will click Search button on Gloria Calloway page
    Then verify expected results as "<Trainee First Name>" and "<Trainee Last Name>" on Gloria Calloway page
    Examples: User fills out the form as in the table below:
    |Trainee First Name|Trainee Last Name|
    |Kate              |Brown            |
    
    @Alena7 @GloriaCalllowaySearch
    Scenario Outline:IDP Search request as Gloria Calloway  specifying  Classification type
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Calloway, Gloria"
    And User will select "<Classification Type>" as Classification type on Gloria Calloway page
    And User will click Search button on Gloria Calloway page
    Then User will verify first page results on Gloria Calloway page classification type are "<Classification Type>"
    Examples: Classification Type Options
    |Classification Type|
    |Fellow             |
    |Employee           |
    |Employee           |
     
    @Alena8 @GloriaCalllowaySearch
    Scenario Outline: Search request as Gloria Calloway specifying NIH SAC
    #Given User opens nih application in browser
    When User will login to the application as "nekrashevicha2" user
    And Logged in user changes the user to "Calloway, Gloria"
    And User will select "<NIH SAC>" as NIH SAC on Gloria Calloway page
    And User will click Search button on Gloria Calloway page
    Then User will verify first page results on Gloria Calloway page NIH SAC are "<NIH SAC>"
    Examples: NIH SAC
    |NIH SAC|
    |HNC1   |
    |HNU22  |