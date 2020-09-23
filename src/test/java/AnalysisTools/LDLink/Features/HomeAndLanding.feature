Feature: LDLink Homepage and Landingpage Validation 


@Smoke 
Scenario: Analysis Tools Page - Validate LDlink
When a LDlink user opens Analysis Tools page
Then user verify "LDLink" present on the screen
And user verify the description "A suite of web-based applications designed to easily and efficiently explore linkage disequilibrium in population subgroups. All population genotype data originates from Phase 3 of the 1000 Genomes Project and variant RS numbers are indexed based on dbSNP build 151."


@Smoke
Scenario: User navigates from landing page to home page
Given a LDlink user opens Analysis Tools page
When user clicks LDLink on landing page 
Then User verify user is on LDlink home page


@Smoke
Scenario: Home Page - Validate LDlink
When a LDlink user opens home page
Then User verify title is "LDlink | An Interactive Web Tool for Exploring Linkage Disequilibrium in Population Groups"