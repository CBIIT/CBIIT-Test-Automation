Feature: Explore GWAS

@Smoke
Scenario: User generates Manhattan Plot 
Given user on PLCO homepage
When user selects explore GWAS
And selects phenotype as BMI at baseline 
And selects ancestry as east asian all
And clicks submit
Then Manhattan Plot displays

@Progression
Scenario: User generates Manhattan Plot with Pairwise Plot
Given user on PLCO homepage
When user selects explore GWAS
And selects Pairwise Plots





