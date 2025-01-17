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
   Scenario: Verify options for VIBE Peer-to-Peer Appreciation Program request
     Given Submitter User logged in to VIBE Peer-to-Peer Appreciation Program application via Portal
     And User navigates to Tickets tab
     And User opens the last VIBE Peer-to-Peer Appreciation Program request submitted
     And User can verify that Approval status is "Requested"
     And User can confirm Cancel button is displayed
     And User can confirm Add Watchers button is displayed
     And User can confirm Add Attachment button is displayed
     When User clicks Cancel button
     Then User can see Cancel confirmation modal
     And User cancels the Cancel confirmation modal
     When User clicks Add Watchers button
     And User adds "Anna Nicholson" as a watcher
     Then User can see that Watch List ticket field is populated with "Anna Nicholson" name
     When User adds attachment
     Then User can verify that VIBE attachment is added

   @selenium @Alena @Regression @AWARDNOM-10 @AWARDNOM-78 @AWARDNOM-82
   Scenario: Verify Optional Responses and Which value best reflects your appreciation options
     Given Submitter User logged in to VIBE Peer-to-Peer Appreciation Program application via Portal
     And User navigates to VIBE Peer-to-Peer Appreciation Program via Services menu
     And Submitter User is on VIBE Peer-to-Peer Appreciation Program home page
     And Submitter User can verify Optional Responses section is displayed
     And User can verify Optional Responses option "Going Above and Beyond—They go the extra mile and provide excellent service." is displayed
     And User can verify Optional Responses option "Building Our Community—They foster inclusivity and build relationships." is displayed
     And User can verify Optional Responses option "Working Behind the Scenes—They perform important tasks without being in the spotlight." is displayed
     And User can verify Optional Responses option "Making It Happen—They achieve results despite challenges." is displayed
     And User can verify Optional Responses option "Finding Creative Solutions—They use creative problem-solving and embrace a growth mindset." is displayed
     And User can verify Optional Responses option "Brightening the Day—Their positive attitude makes work more enjoyable." is displayed
     And User can verify Optional Responses option "Leading the Charge—They take initiative on challenging tasks." is displayed
     And User can verify Optional Responses option "Collaborating on a Project—They are key partners on projects." is displayed
     And User can verify Optional Responses option "In My Own Words - A text box will appear below when checked." is displayed
     And User can see Which value best reflects your appreciation option "Breaking Down Barriers—They actively work to dismantle all forms of discrimination."
     And User can see Which value best reflects your appreciation option "Using Evidence—They base decisions on data and feedback to promote equity."
     And User can see Which value best reflects your appreciation option "Empowering Others—They help foster a sense of belonging and inclusivity."
     And User can see Which value best reflects your appreciation option "Being Trustworthy and Accountable—They promote shared responsibility and accountability in making NCI equitable and inclusive."
     And User can see Which value best reflects your appreciation option "Fostering Belonging and Respect—They cultivate a respectful environment where everyone feels valued."
     And User can see Which value best reflects your appreciation option "Promoting Transparency—They ensure that diversity, equity, and inclusion processes are clear and accessible."
     And User can see Which value best reflects your appreciation option "Being an Ally—They advocate for marginalized or excluded colleagues."
     And User can see Which value best reflects your appreciation option "In My Own Words - A text box will appear below when checked."