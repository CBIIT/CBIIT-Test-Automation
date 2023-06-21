Feature: Regression testing

Background:
    Given User logs in to EIDP "EidpUrlNCI" as "Username" and "Password"

@NCIRenewal @Regression @Smoke @Zamant2
  Scenario: TC01 IDP request creates and decline and approve for Renewal
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on search in dashboard
    And User creates IDP request
      | Search For             | Classification Type | NCI Training Organization | IDP Type|
      | Non-NCI (Fellows Only) | Fellow              | CCR                       | Renewal|
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information
      | Primary Mentor  | LBO             | Co-PM        |
      | Berzofsky,Jay   | Lipkowitz,Stan  | Cole, Steven |
    Then User fills mandatory fields in project deliverable page for renew
    And User fills mandatory fields in career goals page for renew idp
    And User fills mandatory fields in aligning expecations page
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to primary mentor
    And User will click on IDP Awaiting response button
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
    And Logged in user changes the user to "Ginsburg,Erika"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on REVIEWED button then approves and submit
    And User clicks on Yes button
    And Logged in user changes the user to "Lipkowitz,Stan"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    Then User clicks on Marks as REVIEWED button on LBO page
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDP @Regression @sendBackIDPNCIRenewal @Zamant2 @Needs_review
  Scenario: TC02 Send back to primary mentor flow for Renewal
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
    And User will click on review and take action button
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
    And User clicks on No Revision option in all tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button

  @DelegateInitiatesIDP @Regression @Zamant2 @Needs_review
  Scenario: TC10 TD Delegate initiates IDP for Renewal
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
    And User will click on review and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Berzofsky,Jay"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP request for renewal
    And User clicks on No Revision option in all tabs    And User clicks on REVIEW AND TAKE ACTION button
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