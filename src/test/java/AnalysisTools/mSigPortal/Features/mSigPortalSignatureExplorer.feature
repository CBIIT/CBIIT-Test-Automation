Feature: mSigPortal Signature Explorer tab

@Smoke @matarodriguezko
Scenario: Etiology graph on Signature Explorer Page is displayed
Given the user is on the mSigPortal Home page
When the user navigates to the Signature Explorer page
And the user calculates by clicking on the graph
Then a download link for the graph is displayed

@Smoke @matarodriguezko
Scenario: Tumor Mutational Burden graph on Signature Exploration Page is displayed
Given the user is on the mSigPortal Home page
When the user navigates to the Signature Explorer page
And the user calculates by clicking on the graph
Then the Tumor Mutational Burden download plot link is displayed
