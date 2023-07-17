Feature: NHLBI Initial workflow Regression testing

  Background:
    Given User logs in to EIDP "EidpUrlNHLBI" as "Username" and "Password"

  @InitiatesIDPNHLBI @Regression @Smoke @Zamant2
  Scenario: TC01 IDP request creates and decline and approve
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For               | Classification Type | NCI Training Organization | IDP Type |
      | Non-NHLBI (Fellows Only) | Fellow              | DIR                       |          |
    Then Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor | LBO      | Co-PM         |
      | Akera,Takashi  | Hall,Kim | Cordes,Stefan |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    And Logged in user changes the user to "Hall,Kim"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDPNHLBI @Regression @Zamant2
  Scenario: TC02 Send back to primary mentor flow
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For               | Classification Type | NCI Training Organization | IDP Type |
      | Non-NHLBI (Fellows Only) | Fellow              | DIR                       |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor | LBO      | Co-PM         |
      | Akera,Takashi  | Hall,Kim | Cordes,Stefan |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to primary mentor
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SEND BACK TO TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    Then User clicks on Verify Meeting Checkbox
    And User clicks on SUBMIT button
    When Logged in user changes the user to Co-PM
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    And Logged in user changes the user to "Hall,Kim"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ReviseExistingIDPNHLBI @Regression @Zamant2
  Scenario: TC03 Revise Existing IDP
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Review"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldNHLBI @Regression @Zamant2
  Scenario: TC04 IDP is placed on HOLD
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Review"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And Edit general information
    And User selects primary mentor as "Chou,Stella"
    And User will click on review and take action button
    Then User verifies IDP will be placed on hold message
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdpnNHLBI @Regression @Zamant2
  Scenario: TC06 Cancel IDP
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdpNHLBI @Regression @Zamant2
  Scenario: TC07 Undo Cancel IDP
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window

  @AddAndDeleteTempDelegateNHLBI @Regression @Zamant2
  Scenario: TC08 Add/Delete Temporary Delegates
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name     | Start Date | End Date   |
      | Adu,Osei | 12/10/2023 | 12/29/2023 |
    Then User checks "Osei Adu" is added as delegate
    When User deletes "Osei Adu" from delegators table

  @AddAndDeletePermanentDelegateNHLBI @Regression @Zamant2
  Scenario: TC09 Add/Delete Permanent Delegates
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name   |
      | Li,Wen |
    Then User checks "Wenling Li" is added as delegate
    When User deletes "Wenling Li" from delegators table

  @DelegateInitiatesIDPNHLBI @Regression @Zamant2
  Scenario: TC10 TD Delegate initiates IDP
    And Logged in user changes the user to "Smith,Erin"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For               | Classification Type | NCI Training Organization | IDP Type |
      | Non-NHLBI (Fellows Only) | Fellow              | DIR                       |          |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor | LBO      | Co-PM         |
      | Akera,Takashi  | Hall,Kim | Cordes,Stefan |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
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
    When Logged in user changes the user to Co-PM
    And User clicks on the trainee specific IDP request for renewal
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Smith,Erin"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    And Logged in user changes the user to "Hall,Kim"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ExistSurveyNHLBI @Regression @Zamant2
  Scenario: TC11 TD/AO Initiates the Exit Survey for the Fellow/Employee
    And Logged in user changes the user to "Smith,Erin"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHoldNHLBI @Regression @Zamant2
  Scenario: TC12 TD Delegates Release IDP placed on HOLD
    And Logged in user changes the user to "Smith,Erin"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @Regression @SearchFirstNameLastName @Zamant2
  Scenario Outline: TC13 IDP Search request
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User selects IDP type as Trainees with IDP
    And User enters "<Trainee First Name>" to first name input box
    And User enters "<Trainee Last Name>" to last name input box
    And User will click Search button
    Then verify expected results as "<Trainee First Name>" and "<Trainee Last Name>"

    Examples: User fills out the form as in the table below:
      | Trainee First Name | Trainee Last Name |
      | Erin               | Smith             |

  @Regression @Smoke @ClassificationTypesErika @Zamant2
  Scenario Outline: <TC> IDP Search request specifying  Classification type
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User will select "<Classification Type>" as Classification type
    And User will click Search button
    Then User will verify first page results classification type are "<Classification Type>"

    Examples: Classification Type Options
      | Classification Type | TC   |
      | Fellow              | TC14 |
      | Employee            | TC15 |

  @Regression @Smoke @TrainingOrganization @Zamant2
  Scenario Outline: TC16 IDP Search request specifying  Training Organization and Training Lab, Branch, or Office
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User will select "<Training Organization>" as Training Organization
    And User will verify first page search results of "<Training Organization>"

    Examples: Training Organization
      | Training Organization | TC   |
      | DIR                   | TC16 |

  @Regression @Smoke @PrimaryMentor @Zamant2
  Scenario Outline: TC18 IDP Search Request by selecting Primary Mentor
    And Logged in user changes the user to "Morgan,Kristen"
    And User will click on search in dashboard
    And User will select "<Primary Mentor>" as Primary Mentor
    Then User will verify expected result as "<Primary Mentor>"

    Examples: Primary Mentor Options
      | Primary Mentor |
      | Takashi Akera  |

  @Regression @Smoke @SpecifyingFullName @Zamant2
  Scenario Outline: TC19 IDP Search request as Erin Smith specifying a full name
    And Logged in user changes the user to "Smith,Erin"
    Then User will click on search in dashboard
    And User enters "<Trainee First Name>" to first name input box
    And User enters "<Trainee Last Name>" to last name input box
    When User will click Search button
    Then verify expected results as "<Trainee First Name>" and "<Trainee Last Name>"
    Examples: User fills out the form as in the table below:
      | Trainee First Name | Trainee Last Name |
      | Mohit              | Aggarwal          |

  @Regression @Smoke @ClassificationType @Zamant2
  Scenario Outline: <TC> IDP Search request as Erin Smith  specifying  Classification type
    And Logged in user changes the user to "Smith,Erin"
    Then User will click on search in dashboard
    And User will select "<Classification Type>" as Classification type on Gloria Calloway page
    When User will click Search button
    Then User will verify first page results on Gloria Calloway page classification type are "<Classification Type>"

    Examples: Classification Type Options
      | Classification Type | TC   |
      | Fellow              | TC20 |
      | Employee            | TC21 |
