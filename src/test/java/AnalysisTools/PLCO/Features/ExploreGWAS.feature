Feature: Explore GWAS

@Smoke
Scenario: User generates BMI Manhattan Plot for East Asian All
Given user on PLCO homepage
When user selects explore GWAS
And selects phenotype as BMI at baseline 
And selects ancestry as east asian all
And clicks submit
Then Manhattan Plot displays

@Progression
Scenario: User generates pairwise BMI Manhattan plot with top ancestry as east asian all and bottom ancestry as european all
Given user on PLCO homepage
When user selects explore GWAS
And selects Pairwise Plots
And selects phenotype as BMI at baseline 
And selects top ancestry as east asian all
And selects bottom ancestry as european all
And clicks submit
Then Manhattan Plot displays

Scenario: User generates Manhattan Plot with Pairwise Plot
Given user on PLCO homepage
When user selects explore GWAS
And selects Pairwise Plots
And selects phenotype as BMI at baseline 
And selects top ancestry as east asian all
And selects bottom ancestry as european all
And clicks submit
Then Manhattan Plot displays






