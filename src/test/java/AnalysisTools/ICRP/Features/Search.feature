Feature: Search

Description: ICRP Search Database

@Smoke @uddins2
Scenario: User searchs by search term
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database 
And user searchs by "Glioma organoids as patient avatars to improve precision medicine" in search terms
And user selects exact phrase provided 
And user clicks search
Then study titled "Glioma organoids as patient avatars to improve precision medicine" is displayed


@Smoke @uddins2 
Scenario: User searches with default parameters 
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user clicks search
Then "Total Base Projects: 18,957 /" and "Total Projects: 23,914" displays

@Smoke @uddins2 @Progression
Scenario: User searches by Institution
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user searchs "University of Colorado Denver"
And user clicks search
Then projects with institution as "University of Colorado Denver" display



