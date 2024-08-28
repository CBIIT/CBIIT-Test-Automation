Feature: NCI Initial workflow Regression testing

  Background:
#    Given User logs in to EIDP "EidpUrlNCI" as "Username" and "Password"

    @Progression @playwright
    Scenario: name of scenario
#      Given User logs in to EIDP "EidpUrlNCI" as "Username" and "Password"
      Given a user logs in to EIDP "EidpUrlNCI"
      And changes user to "Ginsburg,Erika"
      When user searches for any IDP created
      And checks Trainees without IDP
      And selects Fellow for Classification Type
      And clicks "Search" button
      Then user verifies the search results display
      When a user clicks on a Trainee record where the Initiate Action button is enabled
      And selects "CBIIT" value for NCI Training Organization
      And gets the text of the Trainee's name

  @InitiatesIDPNCI @Regression @Smoke @Zamant2
  Scenario: TC01 IDP request creates and decline and approve
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization | IDP Type |
      | Non-NCI (Fellows Only) | Fellow              | CCR                       |          |
    When Logged in user changes the user to trainee
    Then User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor | LBO            | Co-PM        |
      | Berzofsky,Jay  | Lipkowitz,Stan | Cole, Steven |
    Then User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    When Logged in user changes the user to primary mentor
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    When Logged in user changes the user to trainee
    And User will clickOn proceed button
    Then User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    When Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    Then User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    Then User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    When Logged in user changes the user to "Lipkowitz,Stan"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDPNCI @Regression @Zamant2
  Scenario: TC02 Send back to primary mentor flow
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization | IDP Type |
      | Non-NCI (Fellows Only) | Fellow              | CCR                       |          |
    When Logged in user changes the user to trainee
    Then User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor | LBO            | Co-PM        |
      | Berzofsky,Jay  | Lipkowitz,Stan | Cole, Steven |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    Then User clicks on Send IDP to the Primary Mentor button
    When Logged in user changes the user to primary mentor
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    When Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    Then User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    Then User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    When Logged in user changes the user to primary mentor
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND BACK TO TRAINEE button
    When Logged in user changes the user to trainee
    And User will clickOn proceed button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    And User clicks on the trainee specific IDP request for renewal
    Then User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    When Logged in user changes the user to "Lipkowitz,Stan"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ReviseExistingIDPNCI @Regression @Zamant2
  Scenario: TC03 Revise Existing IDP
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Review"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldNCI @Regression @Zamant2
  Scenario: TC04 IDP is placed on HOLD
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Review"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    When Logged in user changes the user to trainee
    Then User will clickOn proceed button
    And Edit general information
    And User selects primary mentor as "Berzofsky,Jay"
    And User will click on review and take action button
    Then User verifies IDP will be placed on hold message
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    Then User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    When Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdpnNCI @Regression @Zamant2
  Scenario: TC06 Cancel IDP
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    Then User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    When Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdpNCI @Regression @Zamant2
  Scenario: TC07 Undo Cancel IDP
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    Then User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window

  @AddAndDeleteTempDelegateNCI @Regression @Zamant2
  Scenario: TC08 Add/Delete Temporary Delegates
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name          | Start Date | End Date   |
      | Adler,Stephen | 12/10/2023 | 12/29/2023 |
    And User checks "Stephen Adler" is added as delegate
    Then User deletes "Stephen Adler" from delegators table

  @AddAndDeletePermanentDelegateNCI @Regression @Zamant2
  Scenario: TC09 Add/Delete Permanent Delegates
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name          |
      | Adler,Stephen |
    And User checks "Stephen Adler" is added as delegate
    Then User deletes "Stephen Adler" from delegators table

  @DelegateInitiatesIDPNCI @Regression @Zamant2
  Scenario: TC10 TD Delegate initiates IDP
    When Logged in user changes the user to "Bogler, Oliver"
    Then User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization | IDP Type |
      | Non-NCI (Fellows Only) | Fellow              | CCR                       |          |
    When Logged in user changes the user to trainee
    Then User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor | LBO            | Co-PM        |
      | Berzofsky,Jay  | Lipkowitz,Stan | Cole, Steven |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    Then User clicks on Send IDP to the Primary Mentor button
    When Logged in user changes the user to primary mentor
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    When Logged in user changes the user to trainee
    Then User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    Then User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    When Logged in user changes the user to "Bogler, Oliver"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    When Logged in user changes the user to "Lipkowitz,Stan"
    Then User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ExistSurveyNCI @Regression @Zamant2
  Scenario: TC11 TD/AO Initiates the Exit Survey for the Fellow/Employee
    When Logged in user changes the user to "Bogler, Oliver"
    Then User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHoldNCI @Regression @Zamant2
  Scenario: TC12 TD Delegates Release IDP placed on HOLD
    When Logged in user changes the user to "Bogler, Oliver"
    Then User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    Then User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @Regression @SearchFirstNameLastName @ALINA
  Scenario Outline: TC13 IDP Search request
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User selects IDP type as Trainees with IDP
    And User enters "<Trainee First Name>" to first name input box
    And User enters "<Trainee Last Name>" to last name input box
    And User will click Search button
    Then verify expected results as "<Trainee First Name>" and "<Trainee Last Name>"

    Examples: User fills out the form as in the table below:
      | Trainee First Name | Trainee Last Name |
      | Olga               | Kim               |

  @Regression @Smoke @ClassificationTypesErika @ALINA
  Scenario Outline: <TC> IDP Search request specifying  Classification type
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User will select "<Classification Type>" as Classification type
    And User will click Search button
    Then User will verify first page results classification type are "<Classification Type>"

    Examples: Classification Type Options
      | Classification Type | TC   |
      | Fellow              | TC14 |
      | Employee            | TC15 |

  @Regression @Smoke @TrainingOrganization @ALINA
  Scenario Outline: TC16 IDP Search request specifying  Training Organization and Training Lab, Branch, or Office
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User will select "<Training Organization>" as Training Organization
    Then User will verify first page search results of "<Training Organization>"

    Examples: Training Organization
      | Training Organization | TC   |
      | CCR                   | TC16 |
      | CBIIT                 | TC17 |

  @RegressionNCI @Smoke @PrimaryMentor @ALINA
  Scenario Outline: TC18 IDP Search Request by selecting Primary Mentor
    When Logged in user changes the user to "Ginsburg,Erika"
    Then User will click on search in dashboard
    And User will select "<Primary Mentor>" as Primary Mentor
    Then User will verify expected result as "<Primary Mentor>"

    Examples: Primary Mentor Options
      | Primary Mentor |
      | Jay Berzofsky  |

  @RegressionNCI @Smoke @SpecifyingFullName @ALINA
  Scenario Outline: TC19 IDP Search request as Gloria Calloway specifying a full name
    When Logged in user changes the user to "Calloway, Gloria"
    Then User enters "<Trainee First Name>" to first name input box
    And User enters "<Trainee Last Name>" to last name input box
    And User will click Search button on Gloria Calloway page
    Then verify expected results as "<Trainee First Name>" and "<Trainee Last Name>" on Gloria Calloway page

    Examples: User fills out the form as in the table below:
      | Trainee First Name | Trainee Last Name |
      | Kate               | Brown             |

  @RegressionNCI @Smoke @ClassificationTypesGloria @ALINA
  Scenario Outline: <TC> IDP Search request as Gloria Calloway  specifying  Classification type
    When Logged in user changes the user to "Calloway, Gloria"
    Then User will select "<Classification Type>" as Classification type on Gloria Calloway page
    And User will click Search button on Gloria Calloway page
    Then User will verify first page results on Gloria Calloway page classification type are "<Classification Type>"

    Examples: Classification Type Options
      | Classification Type | TC   |
      | Fellow              | TC20 |
      | Employee            | TC21 |

  @Regression @Smoke @NIHSAC @ALINA
  Scenario Outline: <TC>Search request as Gloria Calloway specifying NIH SAC
    When Logged in user changes the user to "Calloway, Gloria"
    Then User will select "<NIH SAC>" as NIH SAC on Gloria Calloway page
    And User will click Search button on Gloria Calloway page
    Then User will verify first page results on Gloria Calloway page NIH SAC are "<NIH SAC>"

    Examples: NIH SAC
      | NIH SAC | TC   |
      | HNC1    | TC22 |
