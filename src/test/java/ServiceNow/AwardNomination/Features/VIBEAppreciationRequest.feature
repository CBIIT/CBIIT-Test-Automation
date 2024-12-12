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

   @selenium @Alena @Regression @AWARDNOM-31 @AWARDNOM-22
   Scenario: Submit VIBE Peer-to-Peer Appreciation Program request
     Given Submitter User logged in to VIBE Peer-to-Peer Appreciation Program application via Portal
     And User navigates to Tickets tab
     And User opens the last VIBE Peer-to-Peer Appreciation Program request submitted
     And User can confirm that the ticket's status is "Work in Progress"
     And User can verify that Approval status is "Requested"
     And User can confirm Cancel button is displayed
     And User can confirm Add Watchers button is displayed
     And User can confirm Add Attachment button is displayed
     When User clicks Cancel button
     Then User can see Cancel confirmation modal
     When User clicks Add Watchers button
     And User adds "Anna Nicholson" as a watcher
     Then User can see that Watch List ticket field is populated with "Anna Nicholson" name
     When User adds attachment
     Then User can verify that attachment is added







