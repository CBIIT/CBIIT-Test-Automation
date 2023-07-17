Feature: NHGRI Renewal workflow Regression testing

Background:
    Given User logs in to EIDP "EidpUrlNIDCR" as "Username" and "Password"
    
  @InitiatesIDP_RenewalNhgri @Regression @Smoke @Zamant2 @Needs_review
  Scenario:TC01 IDP request creates and decline and approve for Renewal
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
    And User will click on review and take action button
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
    And User clicks on No Revision option in all tabs
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

  @IDPOnHoldRenewalNHGRI @Regression @Zamant2 @Needs_review
  Scenario:TC02 IDP is placed on HOLD for Renewal
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
    And User will click on review and take action button
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
    And User clicks on No Revision option in all tabs
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
    And User clicks on the trainee specific IDP request for renewal
    And Director user review, approve & submit
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User checks verify meeting checkbox and submits and waits for home page
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Primary Mentor's Meeting Verification"
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
