 Feature: VIBE Peer-to-Peer Appreciation Program

   Description: This feature file contains scenarios relating to VIBE Peer-to-Peer Appreciation Program

   @selenium @Alena @Regression @AWARDNOM-1 @AWARDNOM-10
   Scenario: Submit VIBE Peer-to-Peer Appreciation Program request
     Given Submitter User logged in to VIBE Peer-to-Peer Appreciation Program application via Portal
     And User navigates to VIBE Peer-to-Peer Appreciation Program via Services menu
     And Submitter User is on VIBE Peer-to-Peer Appreciation Program home page
     And Submitter User can verify that What is your name field is already populated
     And Submitter User chooses Yes for Would you like your appreciation to be anonymous question
     And Submitter User picks "Aaren King" as a colleague to appreciate
     And Submitter User describes their appreciation as " I want to express my appreciation"
     And Submitter User can verify Optional Responses section is displayed
     And Submitter User can verify Which value best reflects your appreciation section is displayed
     And Submitter User can verify that Add Attachment option is displayed
     When Submitter User submits VIBE Peer-to-Peer Appreciation Program request
     Then Submitter User can verify they are redirected to general tickets view page



