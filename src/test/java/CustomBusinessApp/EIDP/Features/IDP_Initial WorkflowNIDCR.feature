
Feature: NIDCR work flows

  
 #@NIDCRIDPComplete  @Smoke
 Scenario: IDP request create by trainee and approve by director flow
 	#Given User opens nidcra application in browser
  When User will login to the application as "gugulothus2" user
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on search in dashboard
  And User creates IDP request
      | Search For             							| Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) 	| All              | DIR                       |
  And Logged in user changes the user to trainee
  And User will clickOn start idp button
  And User fills general information
  	| Primary Mentor | Lab Driector name | Co Primary Mentor |
  	| Walrath,Jessica			| Bolling,Chris| |
  And User fills mandatory fields in project deliverable page
  And User fills mandatory fields in career goals page
  And User fills mandatory fields in aligning expecations page
  And User will click on revew and take action button
  And User clicks on Send IDP to the Primary Mentor button
  And Logged in user changes the user to "Walrath,Jessica"
  And User clicks on the trainee specific IDP request
  And User validates fields in all the tabs and values and clicks on No Revision option
  And User clicks on REVIEW AND TAKE ACTION button 
  And User clicks on SEND IDP TO THE TRAINEE button
  And Logged in user changes the user to trainee
  And User will clickOn proceed button
  And User reviews comments and feedbacks in all the tabs
  And User clicks on SUBMIT button
  And Logged in user changes the user to "Hauser,Belinda"
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
  And Logged in user changes the user to "Walrath,Jessica"
  And User clicks on proceed button of the trainee specific IDP request 
	And User clicks on Verify meeting and accept IDP button
  And User enters meeting date and submits and waits for home queue
  And Logged in user changes the user to "Bolling,Chris"
  And User will click on IDP Awaiting response button
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on APPROVE IDP button
  And User clicks on yes button on trainee page  
    
   @TDReviewReturnToPM 
  Scenario: Send the IDP to PM From TD Review
  #Given User opens nidcra application in browser
  When User will login to the application as "gugulothus2" user
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on search in dashboard
  And User creates IDP request
      | Search For             							| Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) 	|               | DIR                       |
  And Logged in user changes the user to trainee
  And User will clickOn start idp button
  And User fills general information
  	| Primary Mentor | Lab Driector name | Co Primary Mentor |
  	| Walrath,Jessica			| Bolling,Chris| Sekiguchi,Rei|
  And User fills mandatory fields in project deliverable page
  And User fills mandatory fields in career goals page
  And User fills mandatory fields in aligning expecations page
  And User will click on revew and take action button
  And User clicks on Send IDP to the Primary Mentor button
  And Logged in user changes the user to "Walrath,Jessica"
  And User clicks on the trainee specific IDP request
  And User validates fields in all the tabs and values and clicks on No Revision option
  And User clicks on REVIEW AND TAKE ACTION button 
  And User clicks on SEND IDP TO THE TRAINEE button
  And Logged in user changes the user to trainee
  And User will clickOn proceed button
  And User reviews comments and feedbacks in all the tabs
  And User clicks on SUBMIT button 
  And Logged in user changes the user to "Sekiguchi,Rei"
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on REVIEWED button
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on IDP Awaiting response button
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on RETURN TO THE PRIMARY MENTOR button
  And Logged in user changes the user to "Walrath,Jessica"
  Then User verifies trainnee request is displayed
  
  
  @TDSendBackToFellow 
  Scenario: Send the IDP to fellow From TD Review
  #Given User opens nidcra application in browser
  When User will login to the application as "gugulothus2" user
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on search in dashboard
  And User click on Search button
  And User creates IDP request
      | Search For             							| Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) 	| All              | DIR                       |
  And Logged in user changes the user to trainee
  And User will clickOn start idp button
  And User fills general information
  	| Primary Mentor | Lab Driector name | Co Primary Mentor |
  	| Walrath,Jessica			| Bolling,Chris| Sekiguchi,Rei|
  And User fills mandatory fields in project deliverable page
  And User fills mandatory fields in career goals page
  And User fills mandatory fields in aligning expecations page
  And User will click on revew and take action button
  And User clicks on Send IDP to the Primary Mentor button
  And Logged in user changes the user to "Walrath,Jessica"
  And User clicks on the trainee specific IDP request
  And User validates fields in all the tabs and values and clicks on No Revision option
  And User clicks on REVIEW AND TAKE ACTION button 
  And User clicks on SEND IDP TO THE TRAINEE button
  And Logged in user changes the user to trainee
  And User will clickOn proceed button
  And User reviews comments and feedbacks in all the tabs
  And User clicks on SUBMIT button 
  And Logged in user changes the user to "Sekiguchi,Rei"
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on REVIEWED button
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on IDP Awaiting response button
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on RETURN TO TRAINEE button
  And Logged in user changes the user to trainee
  Then Trainee verifies IDP request status as "Under Primary Mentor's Review"
  
  #The below scenario covers 1) IDP Declined by PM 2) IDPs Sent to TD Queue
  
  @NIDCRAPMDecline
  Scenario: Send the IDP to fellow From TD Review
  #Given User opens nidcra application in browser
  When User will login to the application as "gugulothus2" user
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on search in dashboard
  And User creates IDP request
      | Search For             							| Classification Type | NCI Training Organization |
      | NIDCR (Fellows and Employees Only) 	| Fellow              | DIR                       |
  And Logged in user changes the user to trainee
  And User will clickOn start idp button
  And User fills general information
  	| Primary Mentor | Lab Driector name | Co Primary Mentor |
  	| Walrath,Jessica			| Bolling,Chris| Sekiguchi,Rei|
  And User fills mandatory fields in project deliverable page
  And User fills mandatory fields in career goals page
  And User fills mandatory fields in aligning expecations page
  And User will click on revew and take action button
  And User clicks on Send IDP to the Primary Mentor button
  And Logged in user changes the user to "Walrath,Jessica"
  And User clicks on the trainee specific IDP request
  And User clicks on Decline IDP button
  And Logged in user changes the user to trainee
  Then Trainee verifies IDP request status as "Under Trainee's Review"
  And User will clickOn proceed button
  And User clicks on Send IDP to the Primary Mentor button
  And Logged in user changes the user to "Walrath,Jessica"
  Then User clicks on the trainee specific IDP request
  
  
 # below scenario covers IDP Returned to TD from LBO Chief
 @LBOReturnToTD 
 Scenario: IDP Returned to TD from LBO Chief
 #Given User opens nidcra application in browser
  When User will login to the application as "gugulothus2" user
  #And Logged in user changes the user to "Hauser,Belinda"
  #And User will click on search in dashboard
  #And User creates IDP request
      #| Search For             							| Classification Type | NCI Training Organization |
      #| NIDCR (Fellows and Employees Only) 	| Fellow              | DIR                       |
  # step1  
  #And Logged in user changes the user to trainee
  #And User will clickOn start idp button
  #And User fills general information
  #	| Primary Mentor | Lab Driector name | Co Primary Mentor |
  #	| Walrath,Jessica			| Bolling,Chris| Sekiguchi,Rei|
  #And User fills mandatory fields in project deliverable page
  #And User fills mandatory fields in career goals page
  #And User fills mandatory fields in aligning expecations page
  #And User will click on revew and take action button
  #And User clicks on Send IDP to the Primary Mentor button
  # step2
  #And Logged in user changes the user to "Walrath,Jessica"
  #And User clicks on the trainee specific IDP request 
  #And User validates fields in all the tabs and values and clicks on No Revision option
  #And User clicks on REVIEW AND TAKE ACTION button 
  #And User clicks on SEND IDP TO THE TRAINEE button
  # step3  
  #And Logged in user changes the user to trainee
  #And User will clickOn proceed button
  #And User reviews comments and feedbacks in all the tabs
  #And User clicks on SUBMIT button
  ##step5   
  And Logged in user changes the user to "Sekiguchi,Rei"
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on REVIEWED button
  #step 7
  And Logged in user changes the user to "Hauser,Belinda"
  And User will click on IDP Awaiting response button
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button
  And User clicks on RETURN TO TRAINEE button
  #step 8
  And Logged in user changes the user to trainee
  And User clicks on proceed button of the trainee specific IDP request
  And User clicks on SUBMIT button
  And Logged in user changes the user to "Sekiguchi,Rei"
  And User clicks on the trainee specific IDP request
  And User clicks on the trainee specific IDP request
  And User marks all the fields as reviewed in all the tabs
  And User clicks on REVIEW AND TAKE ACTION button