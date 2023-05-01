Feature: Search

Description: ICRP Search Database

@Smoke @uddins2
Scenario: User searchs by search term
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database 
And user searchs by "Cost" in search terms
And user selects any of the keywords  
And user clicks search
Then results display "Cost"

@Smoke @uddins2
Scenario: User resets search
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user searchs by "Cost" in search terms
And user selects any of the keywords
And user clicks search
Then results display "Cost"
And click on reset button
And validate the search term data is removed


@Smoke @uddins2 @Progression
Scenario: User searches with default parameters 
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user clicks search
Then "Total Base Projects: 6,156 /" and "Total Projects: 6,783" displays


@Smoke @uddins2 
Scenario: User searches by Institution
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user searchs "University of Colorado Denver"
And user clicks search
Then projects with institution as "University of Colorado Denver" display

@Smoke @uddins2 
Scenario: User searches by funding organization
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects Alexs Lemonade Stand Foundation
And user clicks search
Then projects funded by Alexs Lemonade Stand Foundation displays

@Smoke @uddins2
Scenario: User searchs by cancer type 
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects cancer type as brain tumor
And user clicks search
Then projects with cancer type as Brain Tumor display

@Smoke @uddins 
Scenario: User resets search
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user searchs by "Cost" in search terms
And user selects any of the keywords  
And user clicks search
When user clicks reset 
#Then results display



@Smoke @uddins2 
Scenario: User clears search 
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user clicks clear  
And user clicks search
Then all projects are displayed 

@Smoke @uddins2 
Scenario: user searchs by common scientific outline research area
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects normal functioning 
And user clicks search
Then projects with research area as normal functioning display

@Smoke @uddins2
Scenario: user emails results
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user clicks email results
And user enters name
And user enters email
And user clicks send email
Then email is sent 

@Smoke @uddins2
Scenario: user exports default projects
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user clicks export button
And user clicks projects multisheet
Then verify dataset download "ICRP_Search_Results_Export.xlsx"




