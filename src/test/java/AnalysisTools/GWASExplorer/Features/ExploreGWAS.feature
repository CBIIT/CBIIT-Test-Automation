Feature: These are the Explore GWAS page

@Smoke
Scenario: User looks up correlation between BMI at Baseline and Height BQ
Given the user is on the GWAS Explorer home page
When user selects explore GWAS
And selects Phenotype Correlations tab
And selects phenotype as BMI at baseline for phenotype correlation
And selects phenotype as height BQ for phenotype correlation
And writes variant as "rs114124524"
And selects ancestry as European for variant lookup
And selects sex as all for variant lookup
And clicks submit
Then results table displays