Feature: JPSurv Upload

@Smoke @uddins2 
Scenario: User Uploads example Dic and Txt File 
Given the user is on the JPSurv homepage
When user selects Dic and Txt file 
And user clicks upload
And user select year of diagnosis drop down "Year of diagnosis (75-07 individual)"
And user select year of diagnosis start "1976"
And user select year of diagnosis end "2007"
And user select maximum number of years from diagnosis "<= 9"
And user click colon_and_rectum check box
And user click Male check box
And user click all stages check box
And user select max points dropdown as "1"
And user click calculate button
Then user verify survival vs year at diagnosis tab displayed
#When user click download full data set button
#Then user verify an excel file downloaded with name "SEER9_Survival_6CancerSitesByStage"
#When user click export workspace button
#Then user verify a jpsurv file downloaded with name "SEER9_Survival_6CancerSitesByStage"

@Smoke @uddins2 
Scenario: User Upload example CSV file
Given the user is on the JPSurv homepage
When user selects CSV Files
And user clicks upload


@Smoke @uddins2 @Progression
Scenario: User Upload workspace file
Given the user is on the JPSurv homepage
When user selects workspace
And user clicks import