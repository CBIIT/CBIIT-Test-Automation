Feature: Search

Description: ICRP Search Database

@Smoke @matakevin
Scenario: User searchs by search term
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database 
And user searchs by "Glioma invasion under Mechanical Constraints: Mechanotaxis of the 3D Biomimicry Microenvironment" in search terms
And user selects exact phrase provided 
And user clicks search
Then study titled "Glioma invasion under Mechanical Constraints: Mechanotaxis of the 3D Biomimicry Microenvironment" is displayed


@Smoke @matakevin
Scenario: User searches with default parameters 
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user clicks search
Then "Total Base Projects: 5,484 /" and "Total Projects: 6,490" displays

@Smoke @matakevin
Scenario: User searches by Institution
Given user on ICRP home page 
When user clicks ICRP data
And user clicks search database
And user searchs "University of Colorado Denver"
And user clicks search
Then projects with institution as "University of Colorado Denver" display

@Smoke @matakevin
Scenario: User searches by funding organization
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects Alexs Lemonade Stand Foundation
And user clicks search
Then projects funded by Alexs Lemonade Stand Foundation displays

@Smoke @matakevin
Scenario: User searchs by cancer type 
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects cancer type as brain tumor
And user clicks search
Then projects with cancer type as "Brain Tumor" display

@Smoke @matakevin
Scenario: User resets search
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects exact phrase provided 
Then exact phrase provided is selected
When user clicks reset 
Then exact phrase provided is unselected

@Smoke @matakevin
Scenario: User clears search 
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user clicks clear  
And user clicks search
Then all projects are displayed 

@Smoke @matakevin
Scenario: user searchs by common scientific outline research area
Given user on ICRP home page
When user clicks ICRP data
And user clicks search database
And user selects normal functioning 
And user clicks search
Then projects with research area as "1.1 Biology Normal Functioning" display
