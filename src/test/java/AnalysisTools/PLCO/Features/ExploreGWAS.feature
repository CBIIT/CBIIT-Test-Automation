Feature: Explore GWAS

@Smoke
Scenario: User generates BMI Manhattan Plot for East Asian All
Given user on PLCO homepage
When user selects explore GWAS
And selects phenotype as BMI at baseline 
And selects ancestry as East Asian All
And clicks submit
Then Manhattan Plot displays

@Smoke
Scenario: User generates pairwise BMI Manhattan plot with top ancestry as east asian all and bottom ancestry as european all
Given user on PLCO homepage
When user selects explore GWAS
And selects Pairwise Plots
And selects phenotype as BMI at baseline 
And selects top ancestry as East Asian All
And selects bottom ancestry as European All
And clicks submit
Then Manhattan Plot displays


@Smoke
Scenario: Loading Manhattan Plot Displays loading icon
Given user on PLCO homepage
When user selects explore GWAS
And selects phenotype as BMI at baseline 
And selects ancestry as European Female
Then clicks submit for results to load

@Smoke
Scenario:






