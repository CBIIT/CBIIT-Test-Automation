Feature: Browse Phenotype

@Smoke
Scenario: User on Browse Phenotype Tab
    Given user on PLCO homepage
		When user clicks browse phenotype tab
		Then browse phenotype page displays "Please select a phenotype"

