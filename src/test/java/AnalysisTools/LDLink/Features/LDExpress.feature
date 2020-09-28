Feature: LDExpress


@Inprogress
Scenario: User navigates to LDExpress
Given a LDlink user opens home page
When user clicks on LDExpress application
Then user verify the LDExpress screen opened with header "LDexpress Tool"

Scenario: User searchs a list of variants for rs8535
Given user is on LDExpress page
When user enters SNP number "rs8535" 
And user selects population
And user selects tissues
And user clicks calculate 
And user selects variant 
Then user verifies RS number, Position , R-Squared, D , Gene Symbol , Gencode ID , Tissue , Effect Size , P-Value , GTEx for rs3934923


Scenario: User searchs a list of variants for rs3934923
Given user is on LDExpress page
When user enters SNP number "rs3934923" 
And user selects population
And user selects tissues
And user selects D
And user clicks calculate 
And user selects variant 
Then user verifies RS number, Position , R-Squared, D , Gene Symbol , Gencode ID , Tissue , Effect Size , P-Value , GTEx for rs3934923


Scenario: User searchs a list of variants for rs3934923
Given user is on LDExpress page
When user enters SNP number "rs3934923" 
And user selects population
And user selects tissues
And user selects D-Prime
And user enters D-Prime less than or equal to "0.05"
And user enters P is less than "0.05"
And user enters "500001" base pair window
And user clicks calculate 
And user selects variant 
Then user verifies RS number, Position , R-Squared, D , Gene Symbol , Gencode ID , Tissue , Effect Size , P-Value , GTEx for rs3934923








