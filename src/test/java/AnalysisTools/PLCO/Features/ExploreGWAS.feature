Feature: Explore GWAS

@Progression @NCIATWP-3124 
Scenario: User generates BMI Manhattan Plot for East Asian All
Given user on PLCO homepage
When user selects explore GWAS
And selects phenotype as BMI at baseline 
And selects ancestry as East Asian All
And clicks submit
Then Manhattan Plot displays

@Progression 
Scenario: User generates pairwise BMI Manhattan plot with top ancestry as east asian all and bottom ancestry as european all
Given user on PLCO homepage
When user selects explore GWAS
And selects Pairwise Plots
And selects phenotype as BMI at baseline 
And selects top ancestry as East Asian All
And selects bottom ancestry as European All
And clicks submit
Then Manhattan Plot displays


@Smoke @NCIATWP-3047 
Scenario: Loading Manhattan Plot Displays loading icon
Given user on PLCO homepage
When user selects explore GWAS
And selects phenotype as BMI at baseline 
And selects ancestry as European Female
Then clicks submit for results to load

@Progression
Scenario: User looks up BMI at Baseline for variant rs114124524
Given user on PLCO homepage
When user selects explore GWAS
And selects variant lookup tab
And selects phenotype as BMI at baseline for variant lookup
And writes variant as "rs114124524"
And selects ancestry as European for variant lookup
And selects sex as all for variant lookup
And clicks submit
Then results table displays

@Smoke
Scenario: User looks up correlation between BMI at Baseline and Height BQ
Given user on PLCO homepage
When user selects explore GWAS
And selects Phenotype Correlations tab
And selects phenotype as BMI at baseline for phenotype correlation
And selects phenotype as height BQ for phenotype correlation
 






